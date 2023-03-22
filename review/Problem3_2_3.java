public class Problem3_2_3 {
    public static void main(String[] args) {
        int randomSeconds = (int)(Math.random() * 151) + 90;
        System.out.println("Microwaving for " + randomSeconds + " seconds");
        System.out.println("Rolls will be " + ((randomSeconds > 120)? "boiling hot!" : "the right temperature!"));
    }
}
