package com.methods.java;

import java.util.Scanner;

public class Questions {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);


    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int a = 2;
        while (a * a <= n) {
            if (n % a == 0) {
                return false;
            }
            a++;
        }
        if (a * a > n) {
            return true;
        }else {
            return false;
        }

    }
    // armstrong number



}
