package Conditionals;

public class Conditionals {
    public static void main(String[] args) {

        /*
         Syntax of if statement :
         if (boolean expression T or F) {
         //body

         }else {
         // do this
         }

        */
        int salary = 90000;
//        if(salary > 20000){
//            salary = salary + 5000;
//        }else {
//            salary = salary + 1000;
//        }

        //Multiple if-else
        if(salary > 23000){
            salary = salary + 3000;
        }else if (salary > 25000) {
            salary = salary + 4000;
        }else if (salary > 30000){
            salary = salary + 5000;
        }else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
