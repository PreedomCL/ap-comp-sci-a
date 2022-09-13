import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U7Lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.dat"));

        while(scanner.hasNext()) {
            System.out.println(checkString(scanner.nextLine()));
        }
    }

    public static String checkString(String string) {
        if(string.charAt(0) > )
    }
}
