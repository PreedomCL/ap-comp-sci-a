import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U9Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U9Lab4Data.dat"));

        while(scanner.hasNext()) {
            System.out.println(compareNum(scanner.nextInt(), scanner.nextInt()));
        }
    }

    public static String compareNum(int a, int b) {
        if(a > b && a % 2 != 0) {
            return "yes";
        }
        if(b > a && b % 2 != 0) {
            return "no";
        }
        if(a == b && a % 2 == 0) {
            return "aplus";
        }
        return "compsci";
    }
}
