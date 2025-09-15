package com.company;
import java.util.Scanner;

public class Largest_05 {
    public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number for comparison");
        int a = sc.nextInt();
        System.out.println("Enter the number for comparison");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is the greatest number " + a);
        }else{
            System.out.println(" B is the greatest number "+ b);
        }


    }
}
