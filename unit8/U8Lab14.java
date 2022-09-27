import java.util.Scanner;

public class U8Lab14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++) {
            System.out.print("Enter 1st monster's name: ");
            String name1 = scanner.next();
            System.out.print("Enter 1st monster's size: ");
            int size1 = scanner.nextInt();

            System.out.print("Enter 2nd monster's name: ");
            String name2 = scanner.next();
            System.out.print("Enter 2nd monster's size: ");
            int size2 = scanner.nextInt();

            Monster monster1 = new Monster(name1, size1);
            Monster monster2 = new Monster(name2, size2);

            System.out.println("");

            System.out.println(monster1);
            System.out.println(monster2);

            if(monster1.size > monster2.size) {
                System.out.println("Monster one is bigger than Monster two");
            }else {
                System.out.println("Monster one is smaller than Monster two");
            }

            if(monster1.name.equals(monster2.name)) {
                System.out.println("Monster one has the same name as Monster two");
            }
            System.out.println("");
        }
    }
}
