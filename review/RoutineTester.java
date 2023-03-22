public class RoutineTester
{
    public static void main(String[] args)
    {
        Routine myWeek = new Routine();

        myWeek.setSchool(8);
        myWeek.setHobbies(2);
        myWeek.setFriends(2.5);
        myWeek.setSleep(8);

        System.out.println("At school: " + myWeek.getSchool() * 7);
        System.out.println("Sleeping: " + myWeek.getSleep() * 7);
        System.out.println("With friends: " + myWeek.getFriends() * 7);
        System.out.println("Doing fun stuff: " + myWeek.getHobbies() * 7);

        // Prints the totals for the WHOLE WEEK
        myWeek.printTotal();

    }
}

class Routine
{
    private double school, sleep, friends, hobbies;

    public void printTotal() {
        System.out.println("You're busy " + (school + sleep + friends + hobbies) + " hours a week");
    }

    public double getSchool() {
        return school;
    }

    public void setSchool(double school) {
        this.school = school;
    }

    public double getSleep() {
        return sleep;
    }

    public void setSleep(double sleep) {
        this.sleep = sleep;
    }

    public double getFriends() {
        return friends;
    }

    public void setFriends(double friends) {
        this.friends = friends;
    }

    public double getHobbies() {
        return hobbies;
    }

    public void setHobbies(double hobbies) {
        this.hobbies = hobbies;
    }
}