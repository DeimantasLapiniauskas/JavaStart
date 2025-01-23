
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius() + "      " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println(c2);
    }
}
