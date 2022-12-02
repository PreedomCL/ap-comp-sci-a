public class U13Lab4 {
    private static class CoolChicken {

        private float speed;
        private int wings;
        private String name;

        public CoolChicken(float speed, int wings, String name) {
            this.speed = speed;
            this.wings = wings;
            this.name = name;
        }

        public float maxSpeed() {
            return speed * wings;
        }

        public boolean isCool() {
            return maxSpeed() > 1000 && name.contains("cool");
        }

    }

    public static void main(String[] args) {
        CoolChicken a = new CoolChicken( 5.9f, 7, "coolio" );
        System.out.println( a.isCool() );

        CoolChicken b = new CoolChicken( 150.5f, 5, "foghorn" );
        System.out.println( b.isCool() );

        CoolChicken c = new CoolChicken( 314.1f, 5, "notcool" );
        System.out.println( c.isCool() );

        CoolChicken d = new CoolChicken( 212.0f, 56, "ralph" );
        System.out.println( d.isCool() );
    }
}
