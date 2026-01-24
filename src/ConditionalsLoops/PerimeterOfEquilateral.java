package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterOfEquilateral {
    static void main() {
        //Perimeter of equilateral = 3*a here a is the side
        Scanner sc = new Scanner(System.in);
        float periE = 0;
        System.out.println("Enter the value of the side : ");
        int side = sc.nextInt();
        periE = 3 * side;
        System.out.println(periE);

    }
}
