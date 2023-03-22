import java.util.Scanner;

public class Problem4_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your text:");
        String string = scanner.nextLine();
        if(isPalindrome(string)) {
            System.out.println("Your word is a palindrome :)");
        }else {
            System.out.println("Not a palindrome :(");
        }
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static boolean isPalindrome(String string) {
        String noSpaces = string.toLowerCase().replace(" ", "");
        return noSpaces.equals(reverseString(noSpaces));
    }
}
