package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfIsoscelesT {
    static void main() {
        double areaIso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int b = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int h = sc.nextInt();
        areaIso = 0.5*b*h;
        System.out.println(areaIso);


    }
}
