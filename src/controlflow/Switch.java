package controlflow;
public class Switch {
    static void main() {
        String ch= "abc";
        switch(ch) {
            case "abc":
                System.out.println("one");
                break;
            case "pqr":
                System.out.println("Two");
                break;
            case "stu":
               System.out.println("Three");
               break;
            case "xyz":
                System.out.println("Four");
                break;
            default:
                System.out.println("No ans found");

        }
    }
}
