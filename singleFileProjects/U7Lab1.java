import java.util.Scanner;

public class U7Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print(year);
        if(year%4 == 0) {
            System.out.println(" is a leap year");
        }else {
            System.out.println(" is NOT a leap year");
        }
    }
}
