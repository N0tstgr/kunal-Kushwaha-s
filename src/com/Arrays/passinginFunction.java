package com.Arrays;

import java.util.Arrays;

public class passinginFunction {
    static void main(String[] args) {
        int[] nms = {8,9,2,21};
        System.out.println(Arrays.toString(nms));
        change(nms);
        System.out.println(Arrays.toString(nms));
    }
    static void change(int[]Arr){
        Arr[1] = 56;
    }

}
