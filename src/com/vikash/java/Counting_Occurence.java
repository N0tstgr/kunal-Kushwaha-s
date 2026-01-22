package com.vikash.java;
import java.util.Scanner;

public class Counting_Occurence {
    static void main(String[] args) {
        int count = 0;
        int a;
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextLine();
        int n = 12622222;
        while(n>0){
            a = n%10;
            if(a==2){
                count++;



            }
            n = n/10;

        }
        System.out.println(count);
    }
}
