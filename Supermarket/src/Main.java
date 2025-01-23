import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to TECHIN Supermarket!\n");
        Product apple = new Product("Apple", 1.0, 20);
        Product bread = new Product("Bread", 2.0, 5);
        Product milk = new Product("Milk", 1.5, 10);
        List<Product> productList = new ArrayList<>();
        productList.add(apple);
        productList.add(bread);
        productList.add(milk);
        ProductStorage inventory = new ProductStorage(productList);
        Map<Double, Integer> coins = new TreeMap<>(Comparator.reverseOrder());
        coins.put(0.5, 20);
        coins.put(1.0, 10);
        coins.put(2.0, 10);
        coins.put(0.1, 10);
        CashRegister cashRegister = new CashRegister(coins);
        PrintProductList("Initial ", inventory);
        PrintCashList("Initial ", cashRegister);
        buyLoop(inventory, cashRegister);
    }

    private static void PrintCashList(String prefix, CashRegister cashRegister) {
        System.out.println(prefix + cashRegister.getCoinList());
    }

    private static void PrintProductList(String prefix, ProductStorage inventory) {
        System.out.println(prefix + inventory.getProductList());
    }

    private static void buyLoop(ProductStorage inventory, CashRegister cashRegister) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWhat would you like to buy? Type in the name of the desired product:");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Have a fine day!");
                break;
            }
            Product productBeingBought = inventory.getProducts().stream()
                    .filter(product -> Objects.equals(product.getName(), userInput))
                    .findFirst().orElse(null);
            if (productBeingBought != null && productBeingBought.getStockQuantity() > 0) {
                System.out.println("You are trying to buy " + userInput);
                HandleBuying(inventory, cashRegister, productBeingBought, scanner);
            } else {
                throw new SoldOutException();
            }
        }
    }

    private static void HandleBuying(ProductStorage inventory, CashRegister cashRegister, Product productBeingBought, Scanner scanner) {
        double requiredCost = productBeingBought.getPrice();
        double paidCost = 0;
        double change = 0;
        System.out.println("You need to pay " + requiredCost + "\n Provide bill or coin (accepted values: 0.1, 0.5, 1, 2");
        while (true) {
            double userInput = Double.parseDouble(scanner.nextLine());
            cashRegister.addCoin(userInput);
            paidCost += userInput;
            System.out.println("You paid " + paidCost + "in total.");
            if (requiredCost > paidCost) {
                System.out.println("You still need to pay " + (requiredCost - paidCost) + ".");
            } else {
                change = paidCost - requiredCost;
                break;
            }
        }
        System.out.println("Here is your product: " + productBeingBought.getName());
        if (paidCost > requiredCost) {
            System.out.println("Here is your change:");
            cashRegister.giveChange(paidCost - requiredCost);
        }
        PrintProductList("Updated ", inventory);
        PrintCashList("Updated ", cashRegister);
    }
}