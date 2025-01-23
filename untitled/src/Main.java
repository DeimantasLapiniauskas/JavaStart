public class Main {
    public static void main(String[] args) {
        Greeter lit = new LithuanianGreeter();
        lit.greet("First","Second");
        Greeter eng = new EnglishGreeter();
        eng.greet("Pirmas","Antras");
    }
}