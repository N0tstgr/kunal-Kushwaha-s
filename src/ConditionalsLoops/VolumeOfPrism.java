package ConditionalsLoops;

import java.util.Scanner;

public class VolumeOfPrism {
    static void main() {
        float volPrism = 0;
        Scanner sc = new Scanner(System.in);
        /* volume of prism = Area of base * area of height */
        System.out.println("Enter the value of the B: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of the H: ");
        int h = sc.nextInt();
        volPrism = b*h;
        System.out.println(volPrism);


    }
}
