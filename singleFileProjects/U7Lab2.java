import java.util.Scanner;

public class U7Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 3; i ++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println(a - b);
            } else if (b > a) {
                System.out.println(b - a);
            } else {
                System.out.println(a * b);
            }
        }
    }
}
