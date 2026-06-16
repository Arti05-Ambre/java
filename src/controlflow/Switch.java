package controlflow;
public class Switch {
    static void main() {
        char ch= 'J';
        switch(ch) {
            case 'A':
                System.out.println("one");
                break;
            case 'B':
                System.out.println("Two");
                break;
            case 'C':
               System.out.println("Three");
               break;
            case 'D':
                System.out.println("Four");
                break;
            case 'E':
                System.out.println("Five");
                break;
            case 'F':
               System.out.println("Six");
               break;
            case 'G':
               System.out.println("Seven");
               break;
            default:
                System.out.println("No ans found");

        }
    }
}
