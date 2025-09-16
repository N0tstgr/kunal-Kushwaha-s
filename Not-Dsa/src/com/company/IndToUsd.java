package com.company;

import java.util.Scanner;

public class IndToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of indian rupee to convert into usd");
        double rupee = sc.nextDouble();
        double dollar = 0;
        dollar = rupee/88.15;

        System.out.println  ("This is the dollar version of indian rupee "  + dollar);




    }
}
