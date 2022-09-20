import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab2Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(compareFirst(scanner.nextLine()));
        }
    }

    public static String compareFirst(String input) {
        String[] split = input.split(" ");
        return split[0] + (split[0].charAt(0) == split[1].charAt(0)? " has" : " does not have") + " the same first letter as " + split[1];
    }
}
