package com.methods.java;

import java.util.Arrays;

public class Overloading {
    static void main() {
//        fun(4);
        fun("not");
//        same function but different arguments || datatype
//        sum(5,9);
        demo(9,76,5);

        int ans = sum(4,6,78);
        System.out.println(ans);

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


    static int  sum(int a, int b)
    {
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
