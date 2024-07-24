package com.ArrayArrylistLec12;

public class MaxElementArray {
    public static void main(String args[]){
        int arr[]={12,1,2,3,42,3,21,24};

        max(arr);
    }
    public static void max(int arr[]){
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println(maximum);
    }
}
