package com.methods.java;
import java.util.Arrays;
public class VariableLengthArgs {
    public static void main() {
//        fun(3,5,32,1,67,89,56,45,37);
        fun();

        multiple(3,4,"Not","yes","done");
    }

    static void multiple(int a, int b, String ...x){
        System.out.println();

    }
    static void fun(int ...x){
        System.out.println(Arrays.toString(x));
    }
}
