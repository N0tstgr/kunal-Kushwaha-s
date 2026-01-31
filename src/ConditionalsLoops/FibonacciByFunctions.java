package ConditionalsLoops;

import java.util.Scanner;

public class FibonacciByFunctions {
    public int fib(int n){
        int firstnum = 0;
        int secondnum = 1;
        int nextnum = 0;
        for(int i = 0; i<=n; i++){
            System.out.print(firstnum + " , ");
            nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
        return n;
    }

    static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        fib(n);


    }
}
