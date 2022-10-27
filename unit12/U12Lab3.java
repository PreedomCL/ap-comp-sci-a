import java.util.Scanner;

public class U12Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++) {
            if(i == 0) {
                System.out.println(word);
                continue;
            }
            if(i == word.length()-1) {
                for(int j = word.length()-1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.print("\n");
                continue;
            }

            System.out.println(word.charAt(i) + " " + word.charAt(word.length()-i-1));
        }
    }
}
