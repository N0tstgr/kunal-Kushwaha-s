package com.vikash.java;

public class conditionalsAndLoops_2 {
    static void main() {


        /*
        syntax of if statement:
        if (boolean expression T or F){
        //body
        }else {
        //do this
        }
         */

                int salary = 25400;
//                if (salary > 10000) {
//                    salary = salary + 1000;
//                }else {
//                    salary = salary + 500;
//
//                }
//                System.out.println(salary);
//            }
        if (salary > 10000){
            salary += 3000;
        }else if (salary > 40000){
            salary = salary+=4000;
        } else if (salary > 50000){
            salary = salary+5000;
        }else{
            salary = salary + 8000;
        }
        System.out.println(salary);

    }
}
