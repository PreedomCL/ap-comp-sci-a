import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class U8Lab5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab5Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(checkVowel(scanner.nextLine()));
        }
    }

    public static boolean checkVowel(String input) {
        char a = input.toLowerCase(Locale.ROOT).charAt(0);
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'|| (a >= 48 && a <= 57);
    }
}
