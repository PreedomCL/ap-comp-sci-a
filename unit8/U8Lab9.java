import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab9 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab9Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(findPair(scanner.nextLine()));
        }
    }

    public static boolean findPair(String input) {
        String[] split = input.split(" ");
        boolean answer = false;
        for(int i = 1; i < split[0].length()-1; i++) {
            answer = answer || (split[0].charAt(i) == split[1].charAt(0) && split[0].charAt(i+1) == split[2].charAt(0));
        }
        return answer;
    }
}
