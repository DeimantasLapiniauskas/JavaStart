
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> list = new ArrayList<>();
        try {
//            List<String> target = Files.lines(Paths.get(file)).collect(Collectors.toList());
//            List<String[]> variables = target.stream().map(line -> line.split(",")).collect(Collectors.toList());
//            variables.forEach(a -> list.add(new Book(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), a[3])));  List<String[]> variables = target.stream().map(line -> line.split(",")).collect(Collectors.toList());
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .forEach(a -> list.add
                            (new Book(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), a[3])));
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return list;
        }
    }

}
