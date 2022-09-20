import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab8Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(decode(scanner.nextLine()));
        }
    }

    public static String decode(String input) {
        char c = input.charAt(0);
        if(c >= 67)
    }
}
