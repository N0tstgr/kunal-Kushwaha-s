package com.company;
import java.util.Scanner;

class fibonacci{
static int fibonacci(int n){
    if (n==0)
        return 0;
    if(n==1)
        return 1;
    return fibonacci(n-1) + fibonacci(n-2);

}
}
public class Fibonacci_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the fibonacci number : ");
        int a = sc.nextInt();

        System.out.print("Fibonacci series  ");
        fibonacci.fibonacci(6);

    for(int i = 0; i<=a; i++){
        System.out.print( fibonacci.fibonacci(i) + " ");
    }


    }
}
