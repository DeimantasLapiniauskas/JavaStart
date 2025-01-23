public class Product {
    private final String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void setPrice(double price) {
        if(price > 0) this.price = price;
        else System.out.println("Not a valid price: " + price);
    }
    public void takeItem(){
        stockQuantity--;
    }
    public void addItem(){
        stockQuantity++;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}
