import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        receiveInput(scanner, map);
        System.out.println(map.size() + " books in total. \nBooks:");
        orderAndPrintAMap(map);
    }


    private static void receiveInput(Scanner scanner, Map<String, Integer> map) {
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input1 = scanner.nextLine();
            if (input1.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            String input2 = scanner.nextLine();
            map.put(input1, Integer.parseInt(input2));

        }
    }


    private static void orderAndPrintAMap(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(
                    entry.getKey() +
                            " (recommended for " + entry.getValue() +
                            " year-olds or older)"
            );
        }
    }
}


