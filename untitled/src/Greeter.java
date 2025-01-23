public abstract class Greeter {
    public void greet(String firstName, String lastName) {
        System.out.println(
                getGreetingString() + firstName + " " + lastName
        );
    }

    abstract protected String getGreetingString();
}
