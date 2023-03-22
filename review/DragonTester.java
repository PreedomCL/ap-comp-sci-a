class Dragon
{
    private String attack;
    private int level;

    // Write the constructor here
    public Dragon(String attackName, int levelNo)
    {
        attack = attackName;
        level = levelNo;
    }

    // Put getters here

    public int getLevel() {
        return level;
    }

    public String getAttack() {
        return attack;
    }

    // Put other methods here
    public String fight() {
        String attackSeq = "";
        for(int i = 0; i < level; i++) {
            attackSeq += attack;
        }
        return attackSeq;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}

public class DragonTester
{
    public static void main(String[] args)
    {
        // Create a Dragon here to test out the Dragon class!
        Dragon gerad = new Dragon("!><", 3);

        System.out.println(gerad.fight());
        System.out.println(gerad);

    }
}