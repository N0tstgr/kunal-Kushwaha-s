package com.vikash.java;
import java.util.Scanner;
public class FibonacciNumber {
    static void main() {
        int b,c;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            b = i;

            System.out.print(b);
                c = b+i;
        }
    }
}
