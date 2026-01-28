package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    static void main(String[] args) {
        /*
        1 9 50
        34 68 94
        32 87 98





       */
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);


//        int[][] arr1 = {{1,2,3}, //index at 0
//                       {4,5,6}, //index at 1
//                       {7,9,8}}; //index at 2
//        System.out.println(Arrays.deepToString(arr1));


        // for input only
        System.out.println("Enter the values of the matrix : ");


        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();


            }
        }
//
//        //for output only
//        for(int row = 0; row<arr.length; row++){
//            for(int col = 0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] +" ");
//
//            }
//            System.out.println();
//        }

//        for(int row=0; row<=arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        for(String element : arr){
//            System.out.println(element); This is line is used for the enhanced for loop
//        }
        for(int[]a : arr){
            System.out.println(Arrays.toString(a));
        }




    }
}
