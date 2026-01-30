package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(55);
//        list.add(455);
//        list.add(343);
//        list.add(554);
//        list.add(3432);
//        list.add(342);
//        list.add(32);
//        list.add(332);
//        System.out.println(list);
//        list.set(1,33);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);


        //  means taking the i

        //  Taking the input
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());
//            System.out.println(list);
        }

        // for output portion

        // for taking any item at the index
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i)); //passing the index here ?? how this is working is not understandable
        }
        for(int i = 0; i<5; i++){
            System.out.println(list);
        }

    }
}
