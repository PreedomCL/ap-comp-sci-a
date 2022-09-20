import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U8Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 8; i++) {
            System.out.print("Enter a number grade :: ");
            System.out.println(calcGrade(scanner.nextInt()));
        }
    }

    public static String calcGrade(int input) {
        if(input >= 90) {
            return input + " is an A";
        }else if(input >= 80) {
            return input + " is a B";
        }else if(input >= 75) {
            return input + " is a C";
        }else if(input >= 70) {
            return input + " is a D";
        }else {
            return input + " is an F";
        }

    }
}
