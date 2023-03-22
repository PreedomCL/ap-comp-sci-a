import java.util.Scanner;

public class Problem3_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player one's name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter player two's name:");
        String name2 = scanner.nextLine();

        System.out.println("Enter " + name1 + "'s score");
        int score1 = scanner.nextInt();
        System.out.println("Enter " + name2 + "'s score");
        int score2 = scanner.nextInt();

        if(name1.compareTo(name2) < 0) {
            System.out.println(name1 + " scored " + score1 + " points");
            System.out.println(name2 + " scored " + score2 + " points");
        }else {
            System.out.println(name2 + " scored " + score2 + " points");
            System.out.println(name1 + " scored " + score1 + " points");
        }

        if(score1 > score2) {
            System.out.println(name1 + " wins!");
        }else {
            System.out.println(name2 + " wins!");
        }
    }
}
