package com.methods.java;

public class Scoping {
    static void main() {
        int a  = 95;
        int b = 56;
//        System.out.println(marks);
        {
            a= 89;
            int c = 34;

        }
        System.out.println(c);

    }
    static void random(int marks){
        int num = 45;
        System.out.println(num);
        System.out.println(marks);
    }


}
