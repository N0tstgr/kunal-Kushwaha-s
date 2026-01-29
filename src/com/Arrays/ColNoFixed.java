package com.Arrays;

public class ColNoFixed {
    static void main(String[] args) {
        int[][] arr = {
                {1,2,4,5},
                {6,8},
                {8,4,3}
        };
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }
    }
}
