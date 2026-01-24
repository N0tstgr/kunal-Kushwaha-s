package Intro;
import java.util.Scanner;
public class EnterX {
    static void main() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        while(a!='x'){
            for(int i = 0; i<=a; i++){
                sum = sum + i;
            }
            System.out.println("Sum= "+ sum);
        }


    }
}
