package com.vikash.java;
import java.util.Scanner;
public class FibonacciNumber {
    static void main() {
        int b=0;
        int c =0;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         for(int i = 1; c<=a; i++){
             b = b +  i;
             System.out.print(b);
             c = i;


      }
    }
}
