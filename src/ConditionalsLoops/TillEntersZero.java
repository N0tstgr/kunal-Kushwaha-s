package ConditionalsLoops;

import java.util.Scanner;

public class TillEntersZero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        int n = sc.nextInt();
        int sum = 0;
//        int i = 0;
        while(n<=99){
            if(n==0){
                sum = sum+ n;
            }

        }
        System.out.println(sum);
    }
}
