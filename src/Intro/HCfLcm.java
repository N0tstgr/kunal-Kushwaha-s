package Intro;
import java.util.Scanner;
public class HCfLcm {
    public static void main() {
        int lcm,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no ");
        int a = sc.nextInt();
        System.out.println("Enter the second no ");
        int b = sc.nextInt();
//        int n1 = a; This method will also work
//        int n2 = b;
        c = (a*b);

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;


        }
        System.out.println("HCF = "+ a);
//        lcm = (n1*n2)/a; This method will also work
         lcm = c/a;
        System.out.println("LCM = " + lcm);

    }
}
