package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterofRhombus {
    static void main() {
        float periRhom = 0;

        Scanner sc = new Scanner(System.in);
//        perimeter of the rhombus  = 4*side
        System.out.println("Enter the value of the side : ");
        int side = sc.nextInt();
        periRhom = 4*side;
        System.out.println(periRhom);

    }
}
