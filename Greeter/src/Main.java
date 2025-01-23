public class Main {
    public static void main(String[] args) {
        System.out.println(
                new GreeterUpperCaseDecorator(
                        new GreeterImpl()
                ).greet("First", "Second")
        );
    }
}