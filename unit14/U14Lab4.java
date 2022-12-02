public class U14Lab4 {

    private static class Card {

        protected static final String[] FACES = {"ZERO","ACE","TWO","THREE","FOUR",
                "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

        protected String suit;
        protected int face;
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

    private static class BlackJackCard extends Card{

        private int value;

        public BlackJackCard(String suit, int face) {
            super(suit, face);
        }

        public int getValue() {
            if(face == 1) {
                this.value = 11;
            }else if(face < 11) {
                this.value = face;
            }else {
                this.value = 10;
            }
            return value;
        }

        @Override
        public String toString() {
            return super.toString() + "\n" + getValue();
        }
    }

    public static void main(String[] args) {
        Card one = new BlackJackCard("SPADES", 9);
        System.out.println(one.getSuit());
        System.out.println(one.getFace());
        Card two = new BlackJackCard("DIAMONDS", 1);
        System.out.println(two);
        two.setFace(3);
        System.out.println(two);
        Card three = new BlackJackCard("CLUBS", 4);
        System.out.println(three);
        Card four = new BlackJackCard("SPADES", 12);
        System.out.println(four);
        Card five = new BlackJackCard("HEARTS", 12);
        System.out.println(five);
    }
}
