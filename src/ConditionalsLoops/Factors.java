package ConditionalsLoops;
import java.util.Scanner;
public class Factors {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int factors = 1;
        while(n%i==0){
            factors = i;
            i++;
        }
        System.out.println(factors);

    }
}
