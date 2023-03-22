
class Triangle {

    // fields
    private int base;
    private int height;

    // constructor
    public Triangle(int tBase, int tHeight){
        base = tBase;
        height = tHeight;
    }

    // methods
    public int getBase() {
        return base;
    }

    public void setBase(int tBase) {
        base = tBase;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int tHeight) {
        height = tHeight;
    }

    public String toString() {
        return "Triangle with an area of " + area();
    }

    public double area( ) {
        return 0.5*base*height;
    }
}

public class ShapeTester {

    public static void main(String[] args) {

        Triangle tri1 = new Triangle(5,8);
        System.out.println(tri1);
        System.out.println("Base: " + tri1.getBase());
        System.out.println("Area: " + tri1.area());

        tri1.setBase(6);
        System.out.println(tri1);
        System.out.println("Base: " + tri1.getBase());
        System.out.println("Area: " + tri1.area());


        // create second object here
        Triangle tri2 = new Triangle(5, 8);
        System.out.println(tri2);
        System.out.println("Base: " + tri2.getBase());
        System.out.println("Area: " + tri2.area());

        tri2.setBase(6);
        System.out.println(tri2);
        System.out.println("Base: " + tri2.getBase());
        System.out.println("Area: " + tri2.area());
    }

}