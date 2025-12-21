package Intro;
import java.util.Scanner;
public class HCF {
    public static void main() {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no ");
        int a = sc.nextInt();
        System.out.println("Enter the second no ");
        int b = sc.nextInt();
        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;


        }
        System.out.println(a);

    }
}
