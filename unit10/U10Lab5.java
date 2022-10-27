import java.util.Scanner;

public class U10Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();

        int out = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(binary.length()-1-i) == '1') {
                out += Math.pow(2, i);
            }
        }
        System.out.println(binary + " == " + out);
    }
}
