package controlflow;

public class Leap_Year {
public static void main(String[] args) {
    int year = 100;
    if(year%4==0 || (year%400==0 && year%100!=0)){
        System.out.println(year + "  these is a leap year");
    }else{
        System.out.println(year+" These year is no leap year");
    }
}

}
