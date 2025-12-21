package Intro;
import java.util.Scanner;
public class SumOfTwo {
    static void main() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        sum = a + b;
        System.out.println("This is the sum of the two number =" + sum);


    }
}
