public class U13Lab1 {

    private static class Dog {
        private String name;
        private int age;

        public Dog(String name) {
            this.name = name;
            this.age = 1;
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getPeopleAge(int peopleAge) {
            return peopleAge * age;
        }

        public void increaseAgeByOne() {
            age++;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Dog - " + name + " " + age;
        }

    }

    public static void main(String[] args) {
        Dog d = new Dog( "rover" );
        System.out.println( d.getPeopleAge( 7 ) );
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println( d.getPeopleAge( 11 ) );
        System.out.println( d.getName() );
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println( d.getPeopleAge( 8 ) );
        Dog g = new Dog( "bob", 3 );
        System.out.println( g.getName() );
        System.out.println( g.getPeopleAge( 5 ) );
    }
}


