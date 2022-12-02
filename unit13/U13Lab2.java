import java.util.Scanner;

public class U13Lab2 {
    private static class Triangle {
        private int side1;
        private int side2;
        private int side3;
        public Triangle(int side1, int side2, int side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public void print() {
            float s = 0.5f * (side1 + side2 + side3);
            System.out.println("Area == " + String.format("%.5f", Math.sqrt(s * (s-side1) * (s-side2) * (s-side3))));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.print("Enter side 1 :: ");
            int side1 = scanner.nextInt();
            System.out.print("Enter side 2 :: ");
            int side2 = scanner.nextInt();
            System.out.print("Enter side 3 :: ");
            int side3 = scanner.nextInt();

            System.out.println(side1 + " " + side2 + " " + side3);
            new Triangle(side1, side2, side3).print();
        }
    }
}
