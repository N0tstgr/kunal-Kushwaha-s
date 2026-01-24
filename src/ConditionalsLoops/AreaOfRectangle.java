package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfRectangle {
    static void main() {
        float areaR = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the value of the breadth : ");
        int b = sc.nextInt();
        areaR = l*b;
        System.out.println(areaR);


    }
}
