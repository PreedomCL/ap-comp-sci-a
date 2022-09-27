import java.util.Scanner;

public class U8Lab15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 9; i++) {
            System.out.print("Enter a letter :: ");
            char input = scanner.next().charAt(0);

            if(input >= 'a' && input <= 'z') {
                System.out.println(input + " is an lowercase letter. ASCII = " + (int)input);
            }else if(input >= 'A' && input <= 'Z') {
                System.out.println(input + " is a uppercase letter. ASCII = " + (int)input);
            }else if(input >= '0' && input <= '9') {
                System.out.println(input + " is a number. ASCII = " + (int)input);
            }
            System.out.println("");
        }
    }
}
