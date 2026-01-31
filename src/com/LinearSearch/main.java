package com.LinearSearch;

public class main {
    static void main() {
        int[] nums = {3,5,4,6,0,7,};
        int target = 3;
        int ans = linearSearch(nums,target);
//        System.out.println(linearSearch(arr));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        int element = arr[0];
        for(int index=0; index<arr.length; index++){
            if(element == target){
                return index;
            }

        }
//        return index; this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
