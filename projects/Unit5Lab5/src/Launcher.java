import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Slope slope = new Slope();

        for(int i = 0; i < 3; i++) {
            System.out.print("x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("y2: ");
            double y2 = scanner.nextDouble();
            System.out.println("Slope: " + slope.calcSlope(x1, y1, x2, y2));
        }
    }
}
