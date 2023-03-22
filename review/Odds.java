import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index < 21; index++)
        {
            odds.add(index);
        }
        // Call removeEvens on the ArrayList above
        removeEvens(odds);
        // Print the ArrayList to verify the even numbers have been removed
        System.out.println(odds);
    }

    public static void removeEvens(ArrayList<Integer> array)
    {
        int currentIndex = 0;
        while(currentIndex < array.size()) {
            if(array.get(currentIndex) % 2 == 0) {
                array.remove(currentIndex);
                continue;
            }
            currentIndex ++;
        }
    }
}