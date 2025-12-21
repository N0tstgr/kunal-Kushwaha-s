package Intro;
 import java.util.Scanner;
public class YearLeap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int a = sc.nextInt();
        if(a%4==0 || a%400==0){
            System.out.println("this is the leap year " + a);
        }else if(a%100!=0){
            System.out.println("This is not leap year " + a);

        }

;    }

}
