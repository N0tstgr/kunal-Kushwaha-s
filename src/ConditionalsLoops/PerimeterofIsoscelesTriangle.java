package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterofIsoscelesTriangle {
    static void main() {

        float periIso = 0;
//        perimeter of he isosceles triangle = 2*a+b; here a and b are the side of the isosceles triangle
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the a : ");
        int a  = sc.nextInt();
        System.out.println("Enter the value of the b : ");
        int b = sc.nextInt();
        periIso = 2*a+ b;
        System.out.println(periIso);



    }
}
