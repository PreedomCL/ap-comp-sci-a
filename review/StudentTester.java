
public class StudentTester {
    public static void main(String[] args) {
        Student_0 alan = new Student_0("Alan", "Turing", 11);

        System.out.println(alan.getFirstName());
        System.out.println(alan.getLastName());
        System.out.println(alan.getGradeLevel());

        alan.setGradeLevel(12);
        System.out.println(alan.getGradeLevel());

        alan.setGPA(3.45);
        System.out.println(alan.getGPA());

        alan.setGPA(3.55);
        System.out.println(alan.getGPA());

        System.out.println(alan);

        Student_0 ada = new Student_0("Ada", "Lovelace", 12);

        System.out.println(ada.getFirstName());
        System.out.println(ada.getLastName());
        System.out.println(ada.getGradeLevel());

        ada.setGradeLevel(11);
        System.out.println(ada.getGradeLevel());

        ada.setGPA(3.85);
        System.out.println(ada.getGPA());

        ada.setGPA(3.95);
        System.out.println(ada.getGPA());

        System.out.println(ada);
    }
}

class Student_0
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    /**
     * This is a constructor.  A constructor is a method
     * that creates an object -- it creates an instance
     * of the class. What that means is it takes the input
     * parameters and sets the instance variables (or fields)
     * to the proper values.
     *
     * Check out StudentTester.java for an example of how to use
     * this constructor.
     */

    public Student_0(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }

    /* These are the setters
     * Setter methods are used to update variables.
     * Notice that they have void return and take an
     * input.
     *
     * In this example, we create setters for all
     * variables, but as a developer, you can choose
     * if you want to allow variables to be changed.
     */

    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }

    public void setGradeLevel(int newGrade)
    {
        gradeLevel = newGrade;
    }

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    //These are the getters

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public double getGPA()
    {
        return gpa;
    }

    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */

    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}