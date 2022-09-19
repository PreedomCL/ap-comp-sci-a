import java.util.Scanner;

public class U7Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++) {
            System.out.print("Enter and integer: ");
            int num = scanner.nextInt();
            System.out.println(num + " is EVEN: " + (num % 2 == 0));
            System.out.println(num + " is ODD: " + (num % 2 != 0));
        }
    }
}
