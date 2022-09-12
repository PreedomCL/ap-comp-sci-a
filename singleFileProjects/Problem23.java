public class Problem23 {
    public static void main(String[] args) {
        for(int i = 1000 ; i <= 2000; i++) {
            int k = i;
            for(int j = 0; j < 3; j++) {
                if(k % 10 == 3) {
                    System.out.println(i);
                    break;
                }
                k /= 10;
            }
        }
    }
}
