public class ExerciseTester
{
    public static void main(String[] args)
    {
        Exercise exercise1 = new Exercise();
        Exercise exercise2 = new Exercise("Iteration Plus", "Python", 50, 9);

        System.out.println(exercise1.getName());
        System.out.println(exercise1.getProgrammingLanguage());
        System.out.println(exercise1.getPoints());
        System.out.println(exercise1.getDifficulty());

        System.out.println("Name: " + exercise2.getName());
        System.out.println("Language: " + exercise2.getProgrammingLanguage());
        System.out.println("Points: " + exercise2.getPoints());
        System.out.println("Difficulty: " + exercise2.getDifficulty());
    }
}

class Exercise
{
    public String name;
    public String programmingLanguage;
    public int points;
    public int difficulty; // scale of 1 - 5

    // Default constructor.
    public Exercise()
    {
        name = "Hello World";
        programmingLanguage = "Java";
        points = 10;
        difficulty = 3;
    }

    // Edit code in this constructor.
    public Exercise(String name, String programmingLanguage, int points, int difficulty)
    {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.points =  points;
        this.difficulty = difficulty;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public int getPoints() {
        return points;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getName() {
        return name;
    }
}