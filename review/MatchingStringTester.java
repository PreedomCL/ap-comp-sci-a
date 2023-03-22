class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};

    public static int findString(String myString)
    {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(myString))
                return i;
        }
        return -1;
    }
}

public class MatchingStringTester
{
    public static void main(String[] args)
    {
        System.out.println(MatchingString.findString("Karel"));
    }
}