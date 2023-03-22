public class DogTester {
    public static void main(String[] args)
    {
        Dog karel = new Dog("Karel", "Reteriever", true);
        Dog clover = new Dog("Clover", "Corgi");

        System.out.println(karel);
        System.out.println(clover);
    }
}

class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    // Add your constructors here
    public Dog(String name, String breed, boolean hasShots) {
        this.name = name;
        this.breed = breed;
        this.hasShots = hasShots;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.hasShots = false;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;

        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }

        return output;
    }
}