public class Cities
{
    public static void main(String[] args)
    {
        String[] names = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] populations = {667501,2038822,12330000};
        double[] minSunshine = {8.11, 1.36, 6.05};
        for(int i = 0 ; i < 3; i++) {
            System.out.println(names[i] + "'s population is " + populations[i] + ".");
        }
        System.out.println();
        for(int i = 0 ; i < 3; i++) {
            System.out.println("The least amount of sunshine " + names[i] + " get is " + minSunshine[i] + " hours a day.");
        }

    }
}