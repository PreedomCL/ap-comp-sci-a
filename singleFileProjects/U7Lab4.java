import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U7Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.dat"));
        while(scanner.hasNext()) {
            System.out.println(checkSSN(scanner.nextLine()));
        }
    }
    public static String checkSSN(String ssn) {
        String[] groups = ssn.split("-");

        if(groups.length != 3)
            return "bad";
        if(groups[0].length() != 3 || groups[1].length() != 2 || groups[2].length() != 4)
            return "bad";

        return groups[2];
    }
}
