package ConditionalsLoops;

import java.util.Scanner;

public class CSAofCylinder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        /*  Curved Surface area of cylinder = 2*pi*r*h */
        double CSAcyl = 0;
        double pi = Math.PI;
        System.out.println("Enter the value of the r : ");
        int r = sc.nextInt();
        System.out.println("Enter the value of the h: ");
        int h = sc.nextInt();
        CSAcyl = 2*pi*r*h;
        System.out.println(CSAcyl);
    }

}
