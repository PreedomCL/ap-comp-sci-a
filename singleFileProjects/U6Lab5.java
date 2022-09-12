import java.util.Scanner;

public class U6Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        int index = Math.min(word1.length(), scanner.nextInt());

        System.out.println(word1.substring(0, index) + word1.substring(index +1));
    }
}
