package com.vikash.java;

import java.util.Scanner;

public class Calculator_using_loop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.print("Enter The Operator:" );
            char op = sc.next().trim().charAt(0);
            if(op=='+'|| op=='-'|| op=='*' || op=='%' || op=='/'){
                System.out.print("Enter the number : ");
                int a = sc.nextInt();
                System.out.print("Enter the number : ");
                int b = sc.nextInt();

                if (op == '+'){
                    result = a + b;

                }
//                break;
                if (op=='-'){
                    result = a-b;
                }
                if(op=='*'){
                    result = a * b;

                }
                if(op=='/'){
                    if(b!=0){
                        result = a/b;
                    }

                }
                if(op=='%'){
                    result = a%b;
                }

            }
            else if(op=='y' || op=='Y'){
                break;
            }else{
                System.out.println("Invalid Operation");
            }

            System.out.println(result);

        }
    }
}
