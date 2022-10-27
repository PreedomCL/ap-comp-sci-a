import java.util.Scanner;

public class U11Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split("  ");
        System.out.println(split[0] + " - letter to remove " + split[1]);
        System.out.println(split[0].replaceAll(split[1], ""));
    }
}
