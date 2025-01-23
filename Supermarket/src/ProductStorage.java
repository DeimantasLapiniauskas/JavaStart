import java.util.ArrayList;
import java.util.List;

public class ProductStorage {
    List<Product> products;

    public ProductStorage(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addItem(Product product) {
        product.addItem();
    }

    public void takeItem(Product product) {
        product.takeItem();
    }
    public String getProductList(){
        StringBuilder output = new StringBuilder("Product inventory;\n");
        for(Product product:products){
            output.append(product.getName()).append(" Quantity: ").append(product.getStockQuantity()).append("\n");
        }
        return output.toString();

    }
}
