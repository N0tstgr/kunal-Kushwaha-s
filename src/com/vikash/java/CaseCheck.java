package com.vikash.java;
import java.util.Scanner;
public class CaseCheck {
    static void main() {
        Scanner vc = new Scanner(System.in);
        char ch = vc.next().trim().charAt(0);
        System.out.println(ch);
//        String word = "mysterious";
//        System.out.println(word.charAt(2));
                if(ch>= 'a' && ch<='z'){
                    System.out.println("LowerCAse");
                }else{
                    System.out.println("UpperCase");
                }
    }
}
