package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    static void main(String[] args) {
        double areaT = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the height : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of the base : ");
        int b = sc.nextInt();
        areaT = 0.5*a*b;
        System.out.println(areaT);

    }
}
