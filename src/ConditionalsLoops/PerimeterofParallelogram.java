package ConditionalsLoops;

import java.util.Scanner;

public class PerimeterofParallelogram {
    static void main() {
//        permiter of the parallelogram = 2(a+b) here a = side and b = base
        Scanner sc = new Scanner(System.in);
        float periP = 0;
        System.out.println("Enter the value of the a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of the b : ");
        int b = sc.nextInt();
        periP = 2*(a+b);
        System.out.println(periP);

    }
}
