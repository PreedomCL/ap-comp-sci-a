public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr1 = new String[]{"w", "x", "y", "z"};
        printArr(arr1);

        String[] arr2 = new String[]{"a", "b", "c"};
        printArr(arr2);
    }

    public static void printArr(String[] arr)
    {
        for(String s: arr) {
            System.out.println(s);
        }
        System.out.println();

    }
}