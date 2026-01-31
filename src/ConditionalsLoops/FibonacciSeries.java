package ConditionalsLoops;

import java.util.Scanner;

public class FibonacciSeries {
    static void main() {
        int firstnum = 0;
        int secondnum = 1;
        int nextnum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the n : ");
        int n = sc.nextInt();

//        fibonacci using for loop

        for(int i = 0; i<=n; i++){
            System.out.print(firstnum + " , ");
            nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }

//        Fibonacci using while loop
//        int i   = 0;
//        while(i<n){
//            System.out.print(firstnum );
//            nextnum = firstnum + secondnum;
//            firstnum = secondnum;
//            secondnum = nextnum;
//            i++;
//        }

    }
}
