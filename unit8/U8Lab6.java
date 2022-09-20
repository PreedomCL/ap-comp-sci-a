import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab6Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(checkNum(scanner.nextInt()));
        }
    }

    public static int checkNum(int input) {
        if(input % 5 == 0)
            return 1;
        if(input % 4 == 0)
            return 2;
        if(input % 3 == 0)
            return 3;
        return 4;
    }
}
