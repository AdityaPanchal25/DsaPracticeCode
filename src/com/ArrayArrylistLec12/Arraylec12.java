package com.ArrayArrylistLec12;

import java.util.Arrays;

public class Arraylec12 {
    public static void main(String args[]){
        int []nums={2,3,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int []arr){
        arr[0]=99;
    }
}
