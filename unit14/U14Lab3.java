public class U14Lab3 {

    private static class Card {

        private static final String[] FACES = {"ZERO","ACE","TWO","THREE","FOUR",
                "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

        private String suit;
        int face;
        public Card(String suit, int face) {
            this.suit = suit;
            this.face = face;
        }

        public void setFace(int face) {
            this.face = face;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public int getFace() {
            return face;
        }

        public String getSuit() {
            return suit;
        }

        @Override
        public String toString() {
            return FACES[face] + " of " + suit;
        }
    }

    public static void main( String args[] )
    {
        Card one = new Card("SPADES", 9);
        System.out.println(one.getSuit());
        System.out.println(one.getFace());
        Card two = new Card("DIAMONDS", 1);
        System.out.println(two);
        two.setFace(3);
        System.out.println(two);
        Card three = new Card("CLUBS", 4);
        System.out.println(three);
        Card four = new Card("SPADES", 12);
        System.out.println(four);
        Card five = new Card("HEARTS", 12);
        System.out.println(five);
    }
}
