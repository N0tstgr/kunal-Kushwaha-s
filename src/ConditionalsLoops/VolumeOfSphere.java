package ConditionalsLoops;

import java.util.Scanner;

public class VolumeOfSphere {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        /* volume of sphere = (4/3)*pi*(r*r*r)    */
        double volSphere = 0;
        double pi = Math.PI;
        System.out.println("Enter the value of the r: ");
        int r = sc.nextInt();
        volSphere = (4/3.0)*pi*(r*r*r);
        System.out.println(volSphere);

    }
}
