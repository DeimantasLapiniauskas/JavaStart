public class Greeter {

    private GreeterLanguageStrategy greeterLanguageStrategy;
    public void greet(String firstName, String lastName) {
        System.out.println(greeterLanguageStrategy.getGreetingString() + firstName + " " + lastName);
    }
}
