public class GreeterUpperCaseDecorator implements Greeter{
    private final Greeter original;

    public GreeterUpperCaseDecorator(Greeter original) {
        this.original = original;
    }

    @Override
    public String greet(String firstName, String lastName) {
        return original.greet(firstName, lastName).toUpperCase();
    }
}
