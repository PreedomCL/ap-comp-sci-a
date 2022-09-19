import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab2Input.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(compare(scanner.nextLine()));
        }
    }

    public static String compare(String SSN) {
        return "output";
    }
}
