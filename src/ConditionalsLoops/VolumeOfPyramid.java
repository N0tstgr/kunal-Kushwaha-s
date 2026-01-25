package ConditionalsLoops;

import java.util.Scanner;

public class VolumeOfPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        float volPy = 0;
        System.out.println("Enter the value of the length : ");
        int l = sc.nextInt();
        System.out.println("Enter the value of the width : ");
        int w = sc.nextInt();
        System.out.println("Enter the value of the height: ");
        int h = sc.nextInt();
        volPy = (float)(1.0/3)*l*w*h;
        System.out.println(volPy);
    }
}
