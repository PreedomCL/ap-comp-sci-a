class Circle
{
    private static final double PI = 3.14159265359;
    public static int numCircles = 0;

    private double radius;

    public Circle(double theRadius)
    {
        radius = theRadius;
        numCircles++;
    }

    public double getArea()
    {
        return PI * radius * radius;
    }

}

public class CircleTester
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + c1.getArea());
        System.out.println("Total circles: " + Circle.numCircles);
        Circle c2 = new Circle(12);
        System.out.println("Area of a circle with radius 12: " + c2.getArea());
        System.out.println("Total circles: " + Circle.numCircles);
        Circle c3 = new Circle(7.5);
        System.out.println("Area of a circle with radius 7.5: " + c3.getArea());
        System.out.println("Total circles: " + Circle.numCircles);
        Circle c4 = new Circle(20);
        System.out.println("Area of a circle with radius 20: " + c4.getArea());
        System.out.println("Total circles: " + Circle.numCircles);
    }
}