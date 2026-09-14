import java.util.Scanner;
import SY.SYMarks;
import TY.TYMarks;

class Student {
    int rollNumber;
    String name;
    SYMarks sy;
    TYMarks ty;

    Student(int rollNumber, String name, SYMarks sy, TYMarks ty) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.sy = sy;
        this.ty = ty;
    }

    void display() {
        int computerMarks = sy.ComputerTotal + ty.Theory + ty.Practicals;

        System.out.println("\nRoll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Computer    : " + computerMarks);

        if (computerMarks >= 70)
            System.out.println("Grade       : A");
        else if (computerMarks >= 60)
            System.out.println("Grade       : B");
        else if (computerMarks >= 50)
            System.out.println("Grade       : C");
        else if (computerMarks >= 40)
            System.out.println("Grade       : PASS CLASS");
        else
            System.out.println("Grade       : FAIL");
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("SY Computer Marks: ");
            int computer = sc.nextInt();

            System.out.print("SY Maths Marks: ");
            int maths = sc.nextInt();

            System.out.print("SY Electronics Marks: ");
            int electronics = sc.nextInt();

            System.out.print("TY Theory Marks: ");
            int theory = sc.nextInt();

            System.out.print("TY Practical Marks: ");
            int practical = sc.nextInt();

            SYMarks sy = new SYMarks(computer, maths, electronics);
            TYMarks ty = new TYMarks(theory, practical);

            students[i] = new Student(roll, name, sy, ty);
        }

        System.out.println("\n--- STUDENT RESULT ---");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
