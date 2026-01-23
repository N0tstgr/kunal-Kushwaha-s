package com.Switch.java;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String city = sc.next();

//        switch (city) {
//            case "London" -> System.out.println("Best city to live in");
//            case "New York" -> System.out.println("Dream city to live in it's safe and futuristic");
//            case "California" -> System.out.println("Here future starts");
//            case "HongKong" -> System.out.println("Techiest city");
//            case "seoul" -> System.out.println("beautiful city");
//            default -> System.out.println("Invalid input");
//
//        }
        int day = sc.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WeekDay");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");

        }

        int day1 = sc.nextInt();
        switch (day1) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
