public class U13Lab3 {
    private static class AngryBear {

        private int daysAwake;
        private int teeth;

        public AngryBear(int daysAwake, int teeth) {
            this.daysAwake = daysAwake;
            this.teeth = teeth;
        }

        public boolean isAngry() {
            return (daysAwake > 3 && teeth < 10) || (teeth == 0) || (daysAwake > 5);
        }

    }

    public static void main(String[] args) {
        AngryBear a = new AngryBear( 10, 3 );
        System.out.println( a.isAngry() );
        AngryBear b = new AngryBear( 10, 35 );
        System.out.println( b.isAngry() );
        AngryBear c = new AngryBear( 1, 25 );
        System.out.println( c.isAngry() );
        AngryBear d = new AngryBear( 6, 40 );
        System.out.println( d.isAngry() );
        AngryBear e = new AngryBear( 1, 1 );
        System.out.println( e.isAngry() );
        AngryBear f = new AngryBear( 111, 111 );
        System.out.println( f.isAngry() );
    }
}
