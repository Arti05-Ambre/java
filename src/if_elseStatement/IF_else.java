package if_elseStatement;

import java.sql.SQLOutput;

public class IF_else {
    static void main(String[] args) {
        int num = -34;
        if( num > 0){
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else if(num==0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("There is no NUmber");
        }
    }

}
