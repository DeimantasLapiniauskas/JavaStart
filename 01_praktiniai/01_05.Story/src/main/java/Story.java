import java.util.Scanner;
public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first. \n What is the main character called?");
        String inputOne = scanner.nextLine();
        System.out.println("What is their job?");
        String inputTwo = scanner.nextLine();
        System.out.println("Here is the story: \n Once upon a time there was " + inputOne + ", who was " + inputTwo + ". \n On the way to work, " + inputOne + " reflected on life. \n Perhaps " + inputOne + " will not be " + inputTwo + " forever.");
    }
}

