package com.methods.java;

public class Overloading {
    static void main() {
//        fun(4);
        fun("not");
//        same function but different arguments || datatype
        sum(5,9);

        sum(4,6,7);
        System.out.println(sum);

    }
    static int  sum(int a, int b){
        return a + b;

    }
    static int sum(int a , int b, int c){
        return a + b + c;
    }
    static void fun(int b){
        System.out.println("First One:  ");
        System.out.println(b);
    }
    static void fun(String name){
        System.out.println("Second One : ");
        System.out.println(name);

    }
}
