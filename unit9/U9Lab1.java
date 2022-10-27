import java.util.Scanner;

public class U9Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String[] split = scanner.nextLine().split(" ");
            if(split[0].compareTo(split[1]) > 0 && split[0].compareTo(split[2]) > 0) {
                System.out.println("Biggest = " + split[0]);
            }else if(split[1].compareTo(split[0]) > 0 && split[1].compareTo(split[2]) > 0) {
                System.out.println("Biggest = " + split[1]);
            }else if(split[2].compareTo(split[0]) > 0 && split[2].compareTo(split[1]) > 0) {
                System.out.println("Biggest = " + split[2]);
            }else {
                System.out.println("All words are the same");
            }
        }
    }
}
