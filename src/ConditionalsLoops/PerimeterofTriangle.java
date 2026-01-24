package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterofTriangle {
    static void main() {
//        perimeter of the triangle = a + b  + c;
        float periT = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the  :  ");
        int a = sc.nextInt();
        System.out.println("Enter the value of the b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of the c : ");
        int c = sc.nextInt();
        periT = a + b + c;
        System.out.println(periT);

    }
}
