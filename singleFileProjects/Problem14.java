import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double h = scanner.nextDouble();

        System.out.printf("%.2f", (h * Math.PI * r * r)/3D);
    }
}
