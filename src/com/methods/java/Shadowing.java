package com.methods.java;

public class Shadowing {
    static int x = 34;

   public static void main(String[] args) {
       System.out.println(x);
       int x ; //the class variable at line 4 is shadowed by this line (declaring)
//       System.out.println(x); scope is begin when the value is initialised
       x = 78;//(initialising)
       System.out.println(x);//45
       fun();


    }
    static void fun(){
        System.out.println(x);
    }
}
