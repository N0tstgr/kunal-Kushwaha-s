package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 32;
        arr[2] = 39;
        arr[3] = 35;
        arr[4] = 38;
        //[23,45,233,543,3]
        System.out.println(arr[4]);
        //input using for loops
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for (int j : arr) {// for every element in array, print the element
//            System.out.print(j + " "); //here j represents element of the array
//        }

//        System.out.println(arr[5]); //index out of bound error




        }
}
