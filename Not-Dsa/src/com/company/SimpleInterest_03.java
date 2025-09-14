package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest_03 {
    public static void main(String[] args) {
//        int principle, rate, time;
        int SimpleInterest;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the principle :  ");
        int principle = sc.nextInt();

        System.out.println("Enter the value of the rate : ");
        int rate = sc.nextInt();

        System.out.println("Enter the value of the time : ");
        int time = sc.nextInt();

        SimpleInterest = (principle * rate * time)/100;
        System.out.println("This is the Simple interest of the given Value" + SimpleInterest);


    }
}
