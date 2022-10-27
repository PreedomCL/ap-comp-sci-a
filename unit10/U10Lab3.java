import java.util.Scanner;

public class U10Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int increment = scanner.nextInt();

        for(int i = start; i < end; i+=increment) {
            System.out.print(i + " ");
        }
    }
}
