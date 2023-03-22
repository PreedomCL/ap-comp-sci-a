import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        boolean gotAnA = scanner.nextInt() >= 90;
        System.out.println("Got an A: " + gotAnA);
    }
}
