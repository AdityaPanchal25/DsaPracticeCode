package com.ArrayArrylistLec12;

import java.util.Arrays;

public class SwapArrayIndex {
    public static void main(String arg[]){
        int arr[]={11,21,31,41,51,61};
        swap(arr,2,4);
    System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
