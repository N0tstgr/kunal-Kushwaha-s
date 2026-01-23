package com.Switch.java;

import java.util.Scanner;

public class NestedSwitch {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the case no : ");
        int empid = sc.nextInt();
        String Department = sc.next();
//        switch(empid){
//            case 1 :
//                System.out.println("vikash");
//                break;
//            case 2:
//                System.out.println("luxxy");
//                break;
//            case 3:
//                System.out.println("zuxxy");
//                break;
//            case 4:
//                System.out.println("abletoDo");
//                break;
//            case 5:
//                System.out.println("Employee number 5");
//                switch(Department){
//                    case "Tesla":
//                        System.out.println("Tesla cars");
//                        break;
//                    case "spacex":
//                        System.out.println("spaceExploration");
//                        break;
//                    case "boringC":
//                        System.out.println("this is the boring company");
//                        break;
//                    default:
//                        System.out.println("No Department Entered");
////                        break;
//                }
//                break;
//            default:
//                System.out.println("Enter the correct Employee id");
//                break;

        switch (empid) {
            case 1 -> System.out.println("vikash");
            case 2 -> System.out.println("luxxy");
            case 3 -> System.out.println("zuxxy");
            case 4 -> System.out.println("abletoDo");
            case 5 -> {
                System.out.println("Employee number 5");
                switch (Department) {
                    case "Tesla" -> System.out.println("Tesla cars");
                    case "spacex" -> System.out.println("spaceExploration");
                    case "boringC" -> System.out.println("this is the boring company");
                    default -> System.out.println("No Department Entered");

//                        break;
                }
            }
            default -> System.out.println("Enter the correct Employee id");
        }
    }
}
