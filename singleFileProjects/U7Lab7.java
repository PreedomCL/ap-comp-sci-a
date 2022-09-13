import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U7Lab7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.dat"));

        while(scanner.hasNext()) {
            System.out.println(checkString(scanner.nextLine()));
        }
    }

    public static String checkString(String string) {
        String[] split = string.split(" ");
        int num = Integer.parseInt(split[1]);
        if(num >= split[0].length())
            return "no can do";
        return string.substring(num, split[0].length()) + string.substring(0, num);
    }
}
