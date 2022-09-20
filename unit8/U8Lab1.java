import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("U8Lab1Data.dat"));

        while(scanner.hasNextLine()) {
            System.out.println(addSNN(scanner.nextLine()));
        }
    }

    public static String addSNN(String SSN) {
        String[] split = SSN.split("-");
        if(split.length != 3)
            return "SS# " + SSN + " has a total of " + -1;
        int sum = 0;
        for(String s: split) {
            sum += Integer.parseInt(s);
        }
        return "SS# " + SSN + " has a total of " + sum;
    }
}
