public class PrintOdds
{
    public static void main(String[] args)
    {
        int[ ] values = {17, 34, 57, 2, 19, 100, 101};

        for(int value: values) {
            if(value % 2 == 1) {
                System.out.println(value + " is odd");
            }
        }
    }
}