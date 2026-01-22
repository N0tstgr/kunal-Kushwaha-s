package com.vikash.java;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the operation to be performed like +/-/%/*");
        char op = sc.next().charAt(0);

        switch (op){
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a-b;
                System.out.println(result);
                break;
            case '*':
                result = a*b;
                System.out.println(result);
                break;
            case '/':
                if(b>0) {
                    result = a % b;
                }else{
                    System.out.println("Error");
                }
                System.out.println(result);



                default:
                System.out.println("Not Valid");


        }

    }
}