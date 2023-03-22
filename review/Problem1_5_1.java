import java.util.Scanner;

public class Problem1_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much does dinner usually cost?");
        double dinnerCost = scanner.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double laserTagCost = scanner.nextDouble();
        System.out.println("How much does a triple scoop cost?");
        double iceCreamCost = scanner.nextDouble();

        double totalDinner = dinnerCost * 3D;
        double totalLaserTag = laserTagCost * 2D;
        double totalIceCream = iceCreamCost * (4D/3D);

        System.out.printf("\nDinner: $%.2f%n", totalDinner);
        System.out.printf("Laser Tag: $%.2f%n", totalLaserTag);
        System.out.printf("Ice Cream: $%.2f%n", totalIceCream);
        System.out.printf("Grand Total: $%.2f%n", totalDinner + totalLaserTag + totalIceCream);

    }
}
