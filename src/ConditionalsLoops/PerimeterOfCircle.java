package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterOfCircle {

    static void main() {
        //    perimeter of the circle = 2*pi*r
        double periC = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the ");
        int r = sc.nextInt();
        double pi = Math.PI;
        periC = 2*pi*r;
        System.out.println(periC);

    }
}
