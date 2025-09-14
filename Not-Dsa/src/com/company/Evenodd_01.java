package com.company;
import java.util.Scanner;

public class Evenodd_01 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();


            if(a%2==0){
                System.out.println("this is even number");
            }else{
                System.out.println("This is odd number");
            }
        sc.close();

    }
}
