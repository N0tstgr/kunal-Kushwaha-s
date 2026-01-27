package com.methods.java;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of the a :");
//        int a  = sc.nextInt();
//        System.out.println("Enter the value of the b : ");
//        int b  = sc.nextInt();
//        System.out.println("Enter the value of the c :" );
//        int c = sc.nextInt();
//        System.out.println("Enter the value of the number : ");
//        int num = sc.nextInt();
//        boolean ans = isArmstrong(num);
//        System.out.println(ans);

        for(int i=100; i<10000; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int num){
        int rem, cube;
        int sum = 0;
        int original = num;
        while(num>0){
            rem = num%10;
            num = num/10;
            cube = rem * rem* rem;
            sum = sum + cube;
        }
        return sum == original;

    }
}
