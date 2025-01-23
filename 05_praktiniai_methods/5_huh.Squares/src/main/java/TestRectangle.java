
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0f, 5.0f);
        System.out.println(r1);
        r1.setLength(40f);
        r1.setWidth(50f);
        System.out.println(r1);
        System.out.println(r1.getArea());
    }
}
