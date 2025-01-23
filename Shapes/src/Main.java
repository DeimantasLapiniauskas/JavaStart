import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectange = new Rectangle();
        Square square = new Square();

        ArrayList<Shape> arrayList = new ArrayList();


        arrayList.add(shape);
        arrayList.add(circle);
        arrayList.add(rectange);
        arrayList.add(square);


        double sum = 0;

        for (Shape name : arrayList) {
            double a = name.getArea();

            if (a != -1) {
                sum += a;
                System.out.println(a);
                System.out.println("==================================");
            }
        }

        System.out.println(sum);
    }
}