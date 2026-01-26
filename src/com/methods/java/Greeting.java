package com.methods.java;
import java.util.Scanner;
public class Greeting {
     public static void main(String[] args) {
         int ques = sum2();
         System.out.println(ques);

    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;

    }
//    static void greeting(){
//        System.out.println("Hello vikash");
//    }
}
