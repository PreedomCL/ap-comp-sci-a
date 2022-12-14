import java.util.ArrayList;

public class QuadraticEquation {
    public double[] calc(double a, double b, double c) {
        double[] answers = new double[2];

        double d = (b * b) - (4 * a * c);
        if(d < 0) {
            return null;
        }
        answers[0] = ((-1 * b) + Math.sqrt(d))/(2D*a);
        answers[1] = ((-1 * b) - Math.sqrt(d))/(2D*a);
        return answers;
    }
}
