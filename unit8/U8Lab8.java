import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 8; i++) {
            System.out.print("Enter a letter :: ");
            System.out.println(decode(scanner.nextLine()));
        }
    }

    public static String decode(String input) {
        char c = input.charAt(0);
        if(c >= 'A' && c <= 'Z') {
            return c + " decodes to " + (char)(c + 32);
        }
        if(c >= 'a' && c <= 'z') {
            return c + " decodes to " + (char)(c - 32);
        }
        if(c >= '0' && c <= '9') {
            return c + " decodes to " + (char)(c + 17);
        }
        return c + " decodes to #";
    }
}
