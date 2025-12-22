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
        c = (a*b);

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;


        }
        System.out.println("HCf = "+ a);
         lcm = c/a;
        System.out.println("LCM = " + lcm);

    }
}
