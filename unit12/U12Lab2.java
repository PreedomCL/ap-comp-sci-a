import java.util.Scanner;

public class U12Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iterations = scanner.nextInt();

        for(int i = 0; i < iterations; i++) {
            for(int j = 0; j < iterations-i; j++) {
                System.out.print("*");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
