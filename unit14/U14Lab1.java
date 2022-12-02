import java.util.Scanner;
import static java.lang.System.out;

public class U14Lab1 {

    private static class Monster {

        String name;
        int size;

        public Monster(String name, int size) {
            this.name = name;
            this.size = size;
        }

        public boolean isBigger(Monster monster) {
            return size > monster.size;
        }

        public boolean isSmaller(Monster monster) {
            return size < monster.size;
        }

        public boolean namesTheSame(Monster monster) {
            return name.equals(monster.name);
        }

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter 1st monster's name : ");
        String name = keyboard.next();
        out.print("Enter 1st monster's size : ");
        int size=keyboard.nextInt();

        Monster mOne = new Monster(name, size);

        out.print("Enter 2nd monster's name : ");
        name = keyboard.next();
        out.print("Enter 2nd monster's size : ");
        size=keyboard.nextInt();

        Monster mTwo = new Monster(name, size);

        if(mOne.isBigger(mTwo)==true)
        {
            out.println("Monster one is bigger than Monster two.");
        }
        else if(mOne.isSmaller(mTwo)==true)
        {
            out.println("Monster one is smaller than Monster two.");
        }

        if(mOne.namesTheSame(mTwo)==true)
        {
            out.println("Monster one has the same name as Monster two.");
        }

    }

}
