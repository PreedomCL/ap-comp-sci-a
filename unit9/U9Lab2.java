import java.util.Scanner;

public class U9Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            double[] nums = {scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()};
            for(int i = 0; i < nums.length; i++) {
                boolean greatest = true;
                for(int j = 0; j < nums.length; j++) {
                    if(j == i)
                        continue;
                    if(nums[i] < nums[j]) {
                        greatest = false;
                        break;
                    }
                }
                if(greatest) {
                    System.out.println("Biggest = " + nums[i] + "\n\n");
                    break;
                }
            }

        }
    }
}
