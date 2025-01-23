public class NotEnoughChangeException extends RuntimeException {
    public NotEnoughChangeException(double amount) {
        super("We're too broke, my guy, we're short about " + amount);
    }
}
