import java.util.Scanner;

public class TripleDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many points did you score?");
        boolean points = scanner.nextInt() >= 10;
        System.out.println("How many rebounds did you get?");
        boolean rebounds = scanner.nextInt() >= 10;
        System.out.println("How many assists did you have?");
        boolean assists = scanner.nextInt() >= 10;

        System.out.println("You got 10 or more points: " + points);
        System.out.println("You got 10 or more rebounds: " + rebounds);
        System.out.println("You got 10 or more assists: " + assists);
    }
}
