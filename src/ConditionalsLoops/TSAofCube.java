package ConditionalsLoops;

import java.util.Scanner;

public class TSAofCube {
    static void main() {
        Scanner sc = new Scanner(System.in);
        /*  total Surface area of cube = 6 * (a*a)  here a = side */
        double pi = Math.PI;
        double TSAcube = 0;
        System.out.println("Enter the value of the ");
        int a = sc.nextInt();
        TSAcube = 6*(a*a);
        System.out.println(TSAcube);
    }
}
