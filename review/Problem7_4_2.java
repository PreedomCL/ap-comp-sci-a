import java.util.ArrayList;
import java.util.List;

public class Problem7_4_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(4, 9, 3, 5, 2, 1));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(5, 8, 2, 6, 1, 3));

        System.out.println("Array 1:");
        for(int num: list1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array 2:");
        for(int num: list2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Sum of Array 1 and 2:");
        for(int i = 0; i < list1.size(); i++) {
            System.out.print((list1.get(i) + list2.get(i)) + " ");
        }
    }
}
