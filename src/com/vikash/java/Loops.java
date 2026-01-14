package com.vikash.java;
import java.util.Scanner;
public class Loops {
    static void main() {
        // Q print numbers from 1 to 13
        System.out.println("input the number  = ");
        /* syntax for the loops
        for (initialization; condition; increment/decrement){
        //body
        }
        //Q : Print numbers from 1 to 13

         */
//        for (int num=1; num<=16; num+=2){
//            System.out.println(num);
//        }
        //print number from 1 to 10
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for(int i = 0; i<=a; i++){
//            System.out.println( "i will do it ");
//        }
        
//While loops
        /*Syntax:
        while(condition){
        //body
         */
//        int num = 1;
//        while(num<=5){
//            System.out.println(num);
//            num++;
//        }

        //Do while loop
        /*
        do{
        }while (condition);
         */

        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n<=7);

    }
}
