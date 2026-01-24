package ConditionalsLoops;

import java.util.Scanner;

public class AreaoFParallelogram {
    static void main() {
        // Area of parallelogram = base * height
        double areaofP = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of the base : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of the height : ");
        int h = sc.nextInt();
        areaofP = b*h;
        System.out.println(areaofP);

    }
}
