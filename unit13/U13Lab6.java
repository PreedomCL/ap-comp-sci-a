public class U13Lab6 {
    private static class CookieJar {

        private final int capacity;
        private int cookies;

        public CookieJar(int capacity) {
            this.capacity = capacity;
            this.cookies = 0;
        }

        public boolean isFull() {
            return cookies == capacity;
        }

        public int spaceLeft() {
            return capacity - cookies;
        }

        public int addStuff(int stuff) {
            if(spaceLeft() < stuff) {
                int remainder = stuff - spaceLeft();
                cookies = capacity;
                return remainder;
            }
            cookies += stuff;
            return -spaceLeft();
        }
    }

    public static void main(String[] args) {
        CookieJar c = new CookieJar( 3000 );			//sets capacity to 3000
        System.out.println( c.isFull( ) );				//cookiejar is not full
        c.addStuff( 500 );						//add 500 items
        //returns -2500 as space is 2500

        System.out.println( c.isFull( ) );				//cookiejar is not full
        System.out.println( c.addStuff( 2000 ) );			//add 2000 items
        //returns -500 as space is 500

        System.out.println( c.spaceLeft( ) );			//space left is 500
        System.out.println( c.isFull( ) );				//cookiejar is not full

        System.out.println( c.addStuff( 2000 ) );			//attempt to add 2000
        //adds 500 and returns 1500
        //1500 was amount left
        //that could not be added

        System.out.println( c.spaceLeft( ) );			//no space left – returns 0
        System.out.println( c.isFull( ) );

    }

}
