import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab7Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(checkString(scanner.nextLine()));
        }
    }

    public static String checkString(String input) {
        int score = input.charAt(0) - input.charAt(input.length()-1);
        if(score > 0)
            return "aplus";
        if(score < 0)
            return "compsci";
        return "apluscompsci";
    }
}
