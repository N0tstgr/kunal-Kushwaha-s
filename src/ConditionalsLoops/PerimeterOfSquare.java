package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterOfSquare {
    static void main() {
        int periS = 0;
        //perimeter of square = 4a here a is Side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the  side : ");
        int side = sc.nextInt();
        periS = 4 * side;
        System.out.println(periS);

    }
}
