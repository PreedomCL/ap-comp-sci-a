import java.util.Scanner;

public class U12Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(" ");
        char c = split[0].charAt(0);
        int iterations = Integer.parseInt(split[1]);

        for(int i = 0; i < iterations; i++) {
            for(int j = iterations-i; j > 0; j--) {
                for(int h = 0; h < 5-(iterations-i-j); h++) {
                    char printC = (char)(c+(iterations-i-j));
                    if(printC > 'Z')
                        printC = 'A';
                    System.out.print(printC);
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
