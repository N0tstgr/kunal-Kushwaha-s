package com.methods.java;

public class passingExample {
    static void main(String[] args) {
        String city = "nyc";
        travel(city);
        System.out.println(city);
        int num = 90;
//        System.out.println(shahr); //because this is (shahr) not in the scope
    }
    static void travel(String shahr){
        shahr = "delhi";
        int num = 90;
//        System.out.println(shahr);
//        return shahr;
    }
}
