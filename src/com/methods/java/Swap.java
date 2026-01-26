package com.methods.java;

public class Swap {
   public  static void main(String[] args) {
        int a = 99;
        int b = 34;

        //Swap numbers code
//        int temp = b;
//        b = a;
//        a = temp;
//        System.out.println(a +" "+ b);
       swap(a,b);
       System.out.println(a + " " + b);
       String name = "not";
       changename(name);
       System.out.println(name);
    }
    static String changename(String name){
        name = "lussy"; //creating a new object not modifying the object so that value does'nt ch
        return name;

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

       }

        }

