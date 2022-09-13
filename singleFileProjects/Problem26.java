import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("input.dat"));
        int j = file.nextInt();
        for (int i = 0; i < j; i++) {
            int x = file.nextInt();
            int y = file.nextInt();

            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(y));
            System.out.println(Integer.toBinaryString(x|y));
            System.out.println(x|y);
        }
    }
}
