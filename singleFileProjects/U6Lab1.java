import java.util.Scanner;

public class U6Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println((word1.length() + word2.length()) / 2f);
    }
}
