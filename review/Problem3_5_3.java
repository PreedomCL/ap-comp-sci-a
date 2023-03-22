import java.util.Scanner;

public class Problem3_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall are you?");
        int height = scanner.nextInt();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if(height >= 42 && age >= 9) {
            System.out.println("Welcome aboard!");
        }else {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
