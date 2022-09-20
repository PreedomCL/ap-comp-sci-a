import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class U8Lab3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab3Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(checkCase(scanner.nextLine()));
        }
    }

    public static String checkCase(String input) {
        String[] split = input.split(" ");
        boolean bool = Boolean.parseBoolean(split[1]);
        return bool? split[0].toUpperCase(Locale.ROOT) : split[0].toLowerCase(Locale.ROOT);
    }
}
