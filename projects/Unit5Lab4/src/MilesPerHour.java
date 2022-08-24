public class MilesPerHour {
    public double calculate(double dist, double hours, double min) {
        return dist/(hours+(min/60D));
    }
}
