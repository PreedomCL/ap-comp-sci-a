import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab12 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab12Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(checkString(scanner.nextLine()));
        }
    }

    public static String checkString(String input) {
        int index = input.indexOf("aplus");
        if(index == -1 && input.length() % 2 == 1) {
            return "a";
        }else if(index != -1 && input.length() % 2 == 0) {
            return "plus";
        }else if(index == 0 && input.lastIndexOf("aplus") == input.length()-5) {
            return "comp";
        }else {
            return "sci";
        }
    }
}
