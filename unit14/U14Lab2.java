import static java.lang.System.out;

public class U14Lab2 {

    private static class Rational {

        private int num, den;

        public Rational(int num, int den) {
            this.num = num;
            this.den = den;
        }

        public boolean isBigger(Rational r) {
            return (float)num / (float)den > (float)r.num / (float)r.den;
        }

        public void add(Rational r) {
            int commonDen = den * r.den;
            num = num * r.den + r.num * den;
            den = commonDen;
            reduce();
        }

        private void reduce() {
            for(int i = Math.min(num, den); i > 0; i --) {
                if(num % i == 0 && den % i == 0) {
                    num /= i;
                    den /= i;
                }
            }
        }

        public void setRational(int num, int den) {
            this.num = num;
            this.den = den;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Rational))
                return false;

            Rational r = (Rational) obj;
            return (float)r.num / r.den == (float)num / den;
        }

        @Override
        public String toString() {
            return num + " / " + den;
        }
    }

    public static void main(String[] args) {
        Rational rOne = new Rational(1,2);
        Rational rTwo = new Rational(2,3);

        out.println("\n\nrOne = "+rOne);
        out.println("rTwo = "+rTwo);

        out.println( "1/2 > 2/3 == " + rOne.isBigger(rTwo) );

        rOne.add(rTwo);
        out.println("\n\nrOne.add(rTwo) = "+ rOne);

        rOne.setRational(1,2);
        rTwo.setRational(1,3);

        out.println( "1/2 > /3 == " + rOne.isBigger(rTwo) );
        rOne.add(rTwo);
        out.println("\n\n1/2.add(1/3) = "+ rOne);

        rOne.setRational(4,10);
        rTwo.setRational(3,5);
        rOne.add(rTwo);
        out.println("\n\n4/10.add(3/5) = "+ rOne);

        rOne.setRational(2,10);
        rTwo.setRational(3,6);
        rOne.add(rTwo);
        out.println("\n\n2/10.add(3/6) = "+ rOne);

//1/4 + 2/8 = 1/2
        rOne.setRational(1,4);
        rTwo.setRational(2,8);
        rOne.add(rTwo);
        out.println("\n\n1/4.add(2/8) = "+ rOne);

//1/6 + 2/8 = 5/12
        rOne.setRational(1,6);
        rTwo.setRational(2,8);
        out.println( "1/6 > 2/8 == " + rOne.isBigger(rTwo) );
        rOne.add(rTwo);
        out.println("\n\n1/6.add(2/8) = "+ rOne);

//1/2 == 2/4
        rOne.setRational(1,2);
        rTwo.setRational(2,4);
        out.println( "\n\n1/2 == 2/4 is " + rOne.equals(rTwo) );

    }
}
