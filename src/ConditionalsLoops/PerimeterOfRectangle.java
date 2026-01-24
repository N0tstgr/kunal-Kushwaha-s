package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterOfRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float periR = 0;
//        perimeter of the rectangle = 2(l+w) here l = length and w = width
        System.out.println("Enter the value of the length : ");
        int l = sc.nextInt();
        System.out.println("Enter the value of the width");
        int w = sc.nextInt();
        periR = 2 * (l+ w);
        System.out.println(periR);

    }
}
