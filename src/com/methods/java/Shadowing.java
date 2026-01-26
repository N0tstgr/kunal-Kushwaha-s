package com.methods.java;

public class Shadowing {
    static int x = 34;

   public static void main(String[] args) {
       System.out.println(x);
       int x = 45; //the class variable at line 4 is shadowed by this line
       System.out.println(x); //45
       fun();


    }
    static void fun(){
        System.out.println(x);
    }
}
