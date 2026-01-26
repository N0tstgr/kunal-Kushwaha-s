package com.methods.java;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class ChangeValue {
    static void main(String[] args) {

        //creating an array
        int[] arr = {1, 3, 2, 45, 9};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]  = 99;/* if you make a change to the object via this ref variable
        same object will be changed
        */


    }

}
