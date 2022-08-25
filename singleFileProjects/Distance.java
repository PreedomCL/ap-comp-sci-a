
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	for(int i = 0; i < 4; i ++) {
            System.out.print("X1: ");
            double x1 = scanner.nextDouble();
            System.out.print("Y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("X1: ");
            double x2 = scanner.nextDouble();
            System.out.print("Y1: ");
            double y2 = scanner.nextDouble();
            distance(x1, y1, x2, y2);
        }
    }

    private static void distance(double x1, double y1, double x2, double y2) {
        double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Distance: " + d);
    }
}