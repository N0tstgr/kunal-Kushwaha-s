package com.vikash.java;
import java.util.Scanner;
public class FibonacciNumber {
    static void main() {
        int b=0;
        int c =0;
        int d = 0;
/*fibonacci is the sum of previous two numbers  f = f(n-1) + f(n-2)
             if first = 0
             and second = 1 then
             then third is 0+1=1
             fourth is 1+ 1 = 2
             fifth is 1 + 2 = 3

 */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         for(int i = 0; i<=a; i++){
             d=i;
             d = b + c;
             b = c;
             c = d;
             System.out.println(d);





      }
    }
}
