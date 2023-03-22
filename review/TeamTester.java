
class Team
{
    public static int totalTeams = 0;
    public static int minTeams = 6;

    public static boolean tournamentReady() {
        return totalTeams >= minTeams;
    }

    // Public Methods
    public Team()
    {
        totalTeams ++;
    }
}

public class TeamTester
{
    public static void main(String[] args)
    {
        // Test out the Teams class here!
        Team team1 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team2 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team3 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team4 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team5 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team6 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team7 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());
        Team team8 = new Team();
        System.out.println(Team.totalTeams + " teams added");
        System.out.println("Ready for tournament? " + Team.tournamentReady());

    }
}