import java.util.Scanner;

public class U11Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int out = 0;
        while(num > 0) {
            out  = (out * 10) + (num % 10);
            num /= 10;
        }
        System.out.println(out);
    }
}
