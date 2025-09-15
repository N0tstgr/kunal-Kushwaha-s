package com.company;
import java.util.Scanner;

public class Calculator_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number  to which you want to perform the operation");
        double a = sc.nextDouble();

        System.out.println("Select the operator to be performed, +, * , / , -");
        char op = sc.next().charAt(0);

        System.out.println("Enter the number  to which you want to perform the operation");
        double b = sc.nextDouble();

        double result = 0;

        switch(op){

            case '+':
                result = a + b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
               if(b!=0){
                   result = a/b;
               }else{
                   System.out.println("There is an error try another input");
               }
               break;

            default:
                System.out.println("This is the out of the range so it is not processable ");

        }

        System.out.println(a +"  "+ op + " " + b + " " + " = "+  result);
    }
}
