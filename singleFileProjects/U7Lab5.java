import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U7Lab5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.dat"));
        while(scanner.hasNext()) {
            System.out.println(checkString(scanner.nextLine()));
        }
    }
    public static String checkString(String input) {
        char c = input.charAt(0);
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == c)
                return "yes";
        }
        return "no";
    }
}
