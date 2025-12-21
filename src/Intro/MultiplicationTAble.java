package Intro;
import java.util.Scanner;

public class MultiplicationTAble {
    static void main() {
        int mux = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table ");
        int a = sc.nextInt();
        for(int i = 1; i<=10; i++){
            mux = a *i;
            System.out.print(mux);
        }
    }
}
