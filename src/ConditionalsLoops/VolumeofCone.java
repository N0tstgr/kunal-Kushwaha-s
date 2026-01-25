package ConditionalsLoops;

import java.util.Scanner;

public class VolumeofCone {
    static void main() {
//        volume of cone = (1/3)*pi*r*r*h
        double volCone = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of the r :  ");
        double pi = Math.PI;
        float r = sc.nextInt();
        System.out.println("Enter the value of the h: ");
        float h = sc.nextInt();
        volCone = (1/3.0)*pi*(r*r)*h;
        System.out.println(volCone);


    }
}
