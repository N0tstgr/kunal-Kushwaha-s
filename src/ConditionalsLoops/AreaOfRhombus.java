package ConditionalsLoops;

import java.util.Scanner;

public class AreaOfRhombus {
    static void main() {
        double areaofR = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the diagonal 1: ");
        int d1 = sc.nextInt();
        System.out.println("Enter the value of the diagonal 2: ");
        int d2 = sc.nextInt();
        areaofR = 0.5*d1*d2;
        System.out.println(areaofR);
    }
}
