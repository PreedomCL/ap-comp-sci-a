public class ClassRoster
{
    public static void main(String[] args)
    {
        Student_1 julian = new Student_1("Julian", "Jones", 9);
        Student_1 larisa = new Student_1("Larisa", "Torres", 10);
        Student_1 amada = new Student_1("Amada", "Robin", 10);
        Student_1 mikka = new Student_1("Mikka", "Leads", 9);
        Student_1 jay = new Student_1("Jay", "Khalil", 10);

        Student_1[] classroom = {julian, larisa, amada, mikka, jay};

        // for each for printing goes here
        for(Student_1 Student_1: classroom) {
            System.out.println("Grade " + Student_1.getGradeLevel() + ": " + Student_1.getFirstName() + " " + Student_1.getLastName());
        }

    }
}

class Student_1
{
    // Attributes
    private String firstName;
    private String lastName;
    private int gradeLevel;

    // Constructor
    public Student_1(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }

    public String getFirstName()
    {
        return firstName;
    }

    // new getter
    public String getLastName()
    {
        return lastName;
    }

    // new getter
    public int getGradeLevel()
    {
        return gradeLevel;
    }
}