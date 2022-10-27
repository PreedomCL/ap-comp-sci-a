import java.util.Scanner;

public class U10Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = scanner.nextInt();
        int numCool = 0;
        for(int i = 6; i < end; i++) {
            boolean cool = true;
            for(int j = 3; j <=6; j++) {
                if(i % j != 1) {
                    cool = false;
                    break;
                }
            }
            if(cool)
                numCool++;
        }

        System.out.println("There are " + numCool + " cool numbers between 6 and " + end);
    }
}
