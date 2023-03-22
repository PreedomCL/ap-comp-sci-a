import java.util.Scanner;

public class Problem3_7_2 {
    public static void main(String[] args) {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        System.out.println("Enter the company's secret code:");
        String code = scanner.nextLine();

        String correctResponse = password + companyCode;
        String response = password + code;

        if(response.equals(correctResponse)) {
            System.out.print("Access Granted");
        }else {
            System.out.print(response + " is denied");
        }

    }
}
