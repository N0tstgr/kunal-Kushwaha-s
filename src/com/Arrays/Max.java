package com.company;

import java.util.Arrays;

import static java.util.Collections.max;

public class Max {
    public static void main(String[] args) {
        int[] arr = {3, 5 ,6 ,7 ,2};
//        maxR(arr,2,3);
        System.out.println(maxR(arr,1,2));

//        System.out.println(max(arr));

    }
    // for printing the whole array
//    static int max(int[] arr){
//        int mx = arr[0];
//        for(int i = 0; i<=arr.length; i++){
//            if(mx<arr[i]){
//                mx = arr[i];
//
//            }
//        }
//        return mx;
//
//    }


    static int maxR(int[] arr, int start, int stop){

        if(stop>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        if(arr.length ==0){
            return -1;
        }
        int mx = arr[start];
        for(int i = start; i<stop; i++){
            if(mx<arr[i]){
                mx = arr[i];

            }
        }
        return mx;

    }
}
