public class U13Lab5 {
    private static class Car {

        private int miles;
        private final int oil;

        public Car(int miles, int oil) {
            this.miles = miles;
            this.oil = oil;
        }

        public boolean timeForOilChange() {
            if(miles >= oil) {
                miles = 0;
                return true;
            }
            return false;
        }

        public void addMiles(int miles) {
            this.miles += miles;
        }

    }

    public static void main(String[] args) {
        Car c = new Car( 9000, 3000 );
        System.out.println( c.timeForOilChange( ) );
        c.addMiles( 2000 );
        System.out.println( c.timeForOilChange( ) );
        c.addMiles( 2000 );
        System.out.println( c.timeForOilChange( ) );
    }
}
