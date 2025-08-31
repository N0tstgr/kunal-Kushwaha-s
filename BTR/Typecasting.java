package BTR;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
       Scanner cal = new Scanner(System.in);
//       float num = cal.nextFloat();
//       int num1 = cal.nextFloat(); Error
//        int num2 = cal.nextInt();
//        System.out.println(num);

//        int num3 = (int)(99.43f);
//        System.out.println(num3);

        //automatic type promotion to expression
//        int a = 557;
//        byte c = (byte)(a); //actually its adding 557 % 256 = 45 and that will become the output thus 45 is the nu
//        // mber which it is not able to calculate
//        byte b = 89;
//        byte c = 45;
//        byte d = 56;
//        int e = b * c/d;
//        System.out.println(e);

//        byte g = 59;
//        g = g * 2;  you cannot assign int into a byte

//        int number = 'C'; //java follows the unicode priniciples
        System.out.println("Bonjour");
        System.out.println(3 * 5);
        byte b = 76;
        char c = 'm';
        short g = 1024;
        int i = 8900;
        float f = 5749.4f;
        double d = 0.24334;
        double result = (f*b) + (i / c) - (d*g);
        //float * int - double = double  //which will big every thing gets changed on that thing
        System.out.println((f*b) + " " +(i / c) +" "+ (d*g));
        System.out.println(result);



    }
}
