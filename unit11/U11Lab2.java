import java.util.Scanner;

public class U11Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.print(num + " has divisors ");
        for(int i = 1; i < num; i++) {
            if(num % i == 0)
                System.out.print(i + " ");
        }
    }

}
