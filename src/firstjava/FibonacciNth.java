package firstjava;
import java.util.Scanner;
public class FibonacciNth {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        int count = 0;
        int a = 0;
        int b = 1;
        while(b<=n){
            int temp = b;
            b = b + a;
            a = temp;

        }
        System.out.println(b);







    }
}
