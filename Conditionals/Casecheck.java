package Conditionals;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {


        Scanner inn = new Scanner(System.in);
        char ch = inn.next().trim().charAt(0);

        if(ch>= 'a' && ch <='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }



    }
}
