package com.methods.java;

import java.util.Scanner;

public class QuestionsDoneRev {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n : ");
        int b = sc.nextInt();
        boolean ans = isPrime(b);
        System.out.println(ans);

    }

    static boolean isPrime(int b) {
      if(b<=1) {
        return false;
    }

    int d = 2;
      while(d*d<=b){
          if(b%d==0){
              return false;
          }
          d++;
      }
        return d * d > b;
}



}
