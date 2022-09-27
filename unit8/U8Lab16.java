import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class U8Lab16 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab16Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(printString(scanner.nextLine()));
        }
    }

    public static String printString(String input) {
        return input + "\n" +
                input.toUpperCase(Locale.ROOT) + "\n" +
                input.toUpperCase(Locale.ROOT).replace(' ', '-') + "\n";
    }
}
