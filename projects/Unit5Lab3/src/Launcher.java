import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quad = new QuadraticEquation();
        for(int i = 0; i < 3; i++) {
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            System.out.print("c: ");
            double c = scanner.nextDouble();

            double[] answers = quad.calc(a, b, c);
            if(answers != null) {
                System.out.println("Answer: " + answers[0] + " or " + answers[1]);
            }
        }
    }
}
