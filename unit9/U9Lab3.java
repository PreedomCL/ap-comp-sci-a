import java.awt.*;
import java.util.Scanner;

public class U9Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year :: ");
        while(scanner.hasNext()) {

            int year = scanner.nextInt();


            System.out.println(year + ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)? " is a leap year" : " is NOT a leap year"));
            System.out.print("Enter a year :: ");
        }
    }
}
