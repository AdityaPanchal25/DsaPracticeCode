package com.LeanearSerchAlgorithmLec13;

public class SearchInRange {
    public static void main(String args[]){
        int arr[]={12,12,11,13,1,5,2,4,32};
        int a=32;
        System.out.println("Element present in array "+linearSearch(arr,a,1,5));
    }
    public static boolean linearSearch(int arr[],int target,int a,int b){
        if(arr.length==0){
            return false;
        }
        for(int index=a;index<=b;index++){
            int element=arr[index];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
