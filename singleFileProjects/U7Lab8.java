import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class U7Lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.dat"));

        while(scanner.hasNext()) {
            System.out.println(checkString(scanner.nextLine()));
        }
    }

    public static String checkString(String string) {
        char f = string.toLowerCase(Locale.ROOT).charAt(0);
        if(f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u')
            return "yes";
        f = string.toLowerCase(Locale.ROOT).charAt(string.length()-1);
        if(f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u')
            return "yes";
        return "no";
    }
}
