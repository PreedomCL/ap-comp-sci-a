import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U9Lab5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U9Lab5Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(multipleOccurrences(scanner.nextLine()));
        }
    }

    public static String multipleOccurrences(String input) {
        return input.indexOf("aplus") != input.lastIndexOf("aplus")? "yes" : "no";
    }
}
