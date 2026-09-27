import java.util.Scanner;

class Sphere {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double surfaceArea() {
        return 4 * 3.14 * radius * radius;
    }

    double volume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}

public class SphereDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Sphere s = new Sphere(r);

        System.out.println("Surface Area = " + s.surfaceArea());
        System.out.println("Volume       = " + s.volume());

        sc.close();
    }
}
