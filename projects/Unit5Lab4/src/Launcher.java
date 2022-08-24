import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MilesPerHour miles = new MilesPerHour();
        for(int i = 0; i < 3; i++) {
            System.out.println("Miles Per Hour: " + miles.calculate(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        }
    }
}
