package com.methods.java;
import java.util.Scanner;
public class Sum {
    static void main() {
        sum();

        /*
         return type name (){
        //body
        return statement
        }
        */
    }

   static void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the number is = "+ sum);
    }
}
