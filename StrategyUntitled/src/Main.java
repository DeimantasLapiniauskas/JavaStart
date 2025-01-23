public class Main {
    public static void main(String[] args) {
        Greeter lit = new Greeter(){
            greeterLanguageStrategy=LithuanianGreetingStrategy;
        };
        lit.greet("Dragon","Lover");
    }
}