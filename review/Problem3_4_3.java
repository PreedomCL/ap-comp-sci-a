import java.util.Scanner;

public class Problem3_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial of the berry");
        char berry = scanner.next().charAt(0);
        if(berry == 'E') {
            System.out.println("You ordered Elderberry");
        }else if(berry == 'G') {
            System.out.println("You ordered Gooseberry");
        }else if(berry == 'L') {
            System.out.println("You ordered Lingonberry");
        }else {
            System.out.println("Berry not recognized");
        }
    }
}
