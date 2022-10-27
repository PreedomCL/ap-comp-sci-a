import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U9Lab6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U9Lab6Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(process(scanner.nextLine()));
        }
    }

    public static String process(String input) {
        if(!input.contains("aplus") && input.length() % 2 != 0) {
            return "a";
        }
        if(input.contains("aplus") && input.length() % 2 == 0) {
            return "plus";
        }
        if(input.indexOf("aplus") == 0 && input.lastIndexOf("aplus") == input.length() - 5) {
            return "comp";
        }
        return "sci";
    }
}
