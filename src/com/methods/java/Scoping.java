package com.methods.java;

public class Scoping {
    static void main() {
        int a  = 95;
        int b = 56;
        String name = "noot";
//        System.out.println(marks);
        {
            a= 89; //it will reassign the original ref variable to some other value;
            System.out.println(a);
            //already initialised outside the block in the same method hence you cannot initialised again
            //but you can change the value as well
            int c = 34;
            name = "luxxxxy";
            //values initialised in this block, will remain in block

        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c);//cannot be used inside the block


        //Scoping in the for
        for(int i = 0; i<=5; i++){
            System.out.println(i);
            int num = 89;
            a = 1000;
        }
        System.out.println(a);
    }






    static void random(int marks){
        int num = 45;
        System.out.println(num);
        System.out.println(marks);
    }


}
