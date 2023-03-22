import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> availablePlayers = new ArrayList();
        addPlayers(availablePlayers);

        String[] roster = new String[5];

        for(int i = 0; i < roster.length; i++) {
            while(true) {
                System.out.println("Enter name of player:");
                String requestedPlayer = scanner.nextLine();
                int playerNum = search(availablePlayers, requestedPlayer);
                if(playerNum == -1) {
                    System.out.println(requestedPlayer + " is not an available player.\n");
                    continue;
                }
                System.out.println("Successfully added new player\n");
                roster[i] = availablePlayers.get(playerNum);
                break;
            }
        }

        System.out.println("Final team roster:");
        for(String s: roster) {
            System.out.println(s);
        }
    }

    public static int search(ArrayList<String> array, String player)
    {
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i).equals(player))
                return i;
        }
        return -1;
    }

    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}