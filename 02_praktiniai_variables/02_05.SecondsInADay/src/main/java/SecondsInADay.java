
import java.text.DecimalFormat;
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter miles:");
        int days = Integer.parseInt(scanner.nextLine());
        String km = new DecimalFormat("#.0").format(days*1.6);
        System.out.println(days + " miles is " + km + " kilometers");
    }
}
