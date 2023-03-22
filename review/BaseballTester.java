public class BaseballTester {
    public static void main(String[] args)
    {
        BaseballPlayer babeRuth = new BaseballPlayer("Babe Ruth", 2873, 8399);
        System.out.println(babeRuth);

        babeRuth.printBattingAverage();


    }
}

class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;

    //Add constructor here
    public BaseballPlayer(String name, int hits, int atBats) {
        this.name = name;
        this.hits = hits;
        this.atBats = atBats;
    }


    public void printBattingAverage()
    {
        double battingAverage = (hits / (double) atBats);
        System.out.println(battingAverage);
    }

    public String toString()
    {
        return name + ": " + hits + " hits/" + atBats + " at bats";
    }
}
