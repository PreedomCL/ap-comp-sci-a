import java.util.Scanner;

public class Problem3_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Old Enough? ");
        boolean oldEnough = scanner.nextBoolean();
        System.out.print("Tall Enough? ");
        boolean tallEnough = scanner.nextBoolean();
        System.out.print("Can Swim? ");
        boolean canSwim = scanner.nextBoolean();
        System.out.print("Has Life Jacket? ");
        boolean hasLifeJacket = scanner.nextBoolean();

        boolean cannotRide = !oldEnough || !tallEnough;
        boolean cannotSwim = !canSwim && !hasLifeJacket;

        System.out.println("Cannot Ride: " + cannotRide);
        System.out.println("Cannot Swim: " + cannotSwim);

    }
}
