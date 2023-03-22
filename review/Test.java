import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        int counter = 0;
        while(counter < list.size())
        {
            counter++;
            list.set(counter, list.get(counter)+5);
        }

        System.out.println(list.toString());
    }
}

class CombinationLock {

      private String combo;

      public CombinationLock(String combo) {

            this.combo = combo;

      }

      public String getClue(String guess) {

            String output = "";

            for(int i = 0; i < combo.length(); i++) {

                  if(guess.charAt(i) == combo.charAt(i)) {

                              output += guess.charAt(i);

                              continue;

                  }

                  if(combo.contains(String.valueOf(guess.charAt(i)))) {

                        output +=   "+";

                        continue;

                  }

                  output += "*";

            }

            return output;

      }

}