package com.company;
import java.util.Scanner;

public class GreetingMessage_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String a = sc.nextLine();
        System.out.println("Hello " + a + " nice to meet you");

    }
}
