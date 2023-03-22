import java.util.Scanner;

public class Problem4_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5 to 10 digit number:");
        String num = scanner.nextLine();
        int i = num.length();
        while(i > 0) {
            i--;
            System.out.println(num.charAt(i));
        }
    }
}
