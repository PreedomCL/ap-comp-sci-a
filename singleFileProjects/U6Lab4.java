import java.util.Scanner;

public class U6Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(word2.charAt(0) + word1.substring(1));
    }
}
