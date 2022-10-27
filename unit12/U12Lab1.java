import java.util.Scanner;

public class U12Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(" ");
        int iterations = Integer.parseInt(split[0]);

        for(int i = 0; i < iterations; i++)  {
            for(int j = 0; j < i+1; j++) {
                System.out.print(split[1]);
            }
            System.out.print("\n");
        }
    }
}
