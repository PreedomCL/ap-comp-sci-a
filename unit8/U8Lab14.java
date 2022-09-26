import java.util.Scanner;

public class U8Lab14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++) {
            System.out.print("Enter 1st monster's name: ");
            String name1 = scanner.next();
            System.out.print("Enter 1st monster's size: ");
            int size1 = scanner.nextInt();

            System.out.print("Enter 2nd monster's name: ");
            String name2 = scanner.next();
            System.out.print("Enter 2nd monster's size: ");
            int size2 = scanner.nextInt();
        }
    }
}
