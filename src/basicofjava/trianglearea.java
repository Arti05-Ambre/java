import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double a = 0.5 * base * height;
        System.out.println("Area of Triangle = " + a);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Shape s = new Triangle(base, height);
        s.area();

        sc.close();
    }
}
