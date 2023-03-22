public class StringEquality {
    public static void main(String[] args) {
        String strx = new String("Problem 2");
        String stry = new String("Problem 2");
        String strz = strx;

        System.out.println("Using == result: " + (strx == stry) + " | Using equals method result: " + strx.equals(stry));
        System.out.println("Using == result: " + (strx == strz) + " | Using equals method result: "  + strx.equals(strz));
    }
}
