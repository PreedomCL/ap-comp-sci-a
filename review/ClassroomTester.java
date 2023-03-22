class Classroom
{
    Student[] students;
    int numStudentsAdded;

    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }

    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
        Student bestStudent = students[0];
        for(Student student: students) {
            if(student.getExamImprovement() > bestStudent.getExamImprovement())
                bestStudent = student;
        }
        return bestStudent;
    }

    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }

    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}

class Student
{
    private static final int NUM_EXAMS = 3;

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    private int[] exams;
    private int numExamsTaken;

    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        exams = new int[NUM_EXAMS];
        numExamsTaken = 0;
    }

    // Implement this method!
    // Returns the sum of the differences between exams
    // Example: Assume exams = {54, 67, 89, 95}
    //          Improvement = (67 - 54) + (89 - 67) + (95 - 89) = 41
    public int getExamImprovement()
    {
        int sum = 0;
        for(int i = 1; i < exams.length; i++) {
            sum += exams[i]-exams[i-1];
        }
        return sum;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }

    // This is a setter method to set the GPA for the Student.
    public void setGPA(double theGPA)
    {
        gpa = theGPA;
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

public class ClassroomTester
{
    public static void main (String[] args)
    {
        Classroom c = new Classroom(2);

        Student ada = new Student("Ada", "Lovelace", 12);
        ada.addExamScore(44);
        ada.addExamScore(65);
        ada.addExamScore(77);

        Student alan = new Student("Alan", "Turing", 11);
        alan.addExamScore(38);
        alan.addExamScore(24);
        alan.addExamScore(31);

        // add students to classroom
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();

        System.out.println(ada.getExamImprovement());
        System.out.println(alan.getExamImprovement());

        Student mostImproved = c.getMostImprovedStudent();
        System.out.println("The most improved student is " + mostImproved.getName());
    }
}