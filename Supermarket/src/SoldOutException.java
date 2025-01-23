public class SoldOutException extends RuntimeException {
    public SoldOutException() {
        super("Error: Product not available!");
    }
}
