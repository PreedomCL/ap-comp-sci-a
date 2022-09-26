import java.util.Scanner;

public class U8Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            System.out.print("Enter a hex number :: ");
            System.out.println(convertHex(scanner.next()));
        }
    }

    public static String convertHex(String hex) {
        int c = hex.charAt(0);
        if(c < 65 || c > 70)
            return hex + " is ERROR in binary";
        return hex + " is " + Integer.toBinaryString(c-55) + " in binary";
    }
}
