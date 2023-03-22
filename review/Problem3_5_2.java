import java.util.Scanner;

public class Problem3_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How tall are you?");
        int height = scanner.nextInt();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println((height >= 42 && age >= 9)? "Welcome aboard!" : "Sorry, you are not eligible to ride");
    }
}
