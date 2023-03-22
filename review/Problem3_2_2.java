import java.util.Scanner;

public class Problem3_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours where you parked?");
        int hours = scanner.nextInt();
        double fee = Math.max(hours * 4.25D, 7D);
        if(hours > 3)
            fee *= .75D;
        System.out.println("You owe $" + fee);
    }
}
