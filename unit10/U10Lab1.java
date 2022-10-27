import java.util.Scanner;

public class U10Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iterations = scanner.nextInt();
        if(iterations <= 0) {
            System.out.println("aplus");
            return;
        }
        for(int i = 0; i < iterations; i++) {
            System.out.print((i+1)*10);
        }
    }
}
