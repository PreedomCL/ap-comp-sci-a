public class Problem24 {
    public static void main(String[] args) {
        for(int i = 1000 ; i <= 10000; i++) {
            int k = i;
            int num3 = 0;
            for(int j = 0; j < 4; j++) {
                if(k % 10 == 3) {
                    num3 ++;
                }
                k /= 10;
            }
            if(num3 == 3) {
                System.out.println(i);
            }
        }
    }
}
