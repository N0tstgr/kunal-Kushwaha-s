package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        System.out.println("Enter the array list : ");

        //Initialisation part             and it is necessary//
        for(int row = 0; row<3; row++){
            list.add(new ArrayList<>());

        }

        //adding the element over it
        for(int row = 0; row<3; row++){
            for(int col=0; col<3; col++){
                list.get(row).add(sc.nextInt());
            }
//            System.out.println();
        }
        System.out.println(list);





    }
}
