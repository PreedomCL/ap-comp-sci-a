public class Monster {
    public String name;
    public int size;

    public Monster(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return name + " " + size;
    }
}
