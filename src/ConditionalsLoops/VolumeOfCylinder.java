package ConditionalsLoops;

import java.util.Scanner;

public class VolumeOfCylinder {
    static void main() {
        /* volume of Cylinder = pi*(r*r)*h   */
        Scanner sc = new Scanner(System.in);
        double volCyl = 0;
        double pi = Math.PI;
        System.out.println("Enter the value of the r: ");
        int r = sc.nextInt();
        System.out.println("Enter the value of the h : ");
        int h = sc.nextInt();

        volCyl = pi*(r*r)*h;
        System.out.println(volCyl);

    }
}
