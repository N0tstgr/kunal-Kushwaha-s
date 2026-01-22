package com.vikash.java;

public class Reverse {
    static void main() {
        int n = 345484;
        int a;
        int rev = 0;
        while(n>0){
            a = n%10;
            rev = rev*10+a;
            n = n/10;


        }
        System.out.println(rev);
    }
}
