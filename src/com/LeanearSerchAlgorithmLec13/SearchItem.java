package com.LeanearSerchAlgorithmLec13;

public class SearchItem {
    public static void main(String args[]){
    int arr[]={12,12,11,13,1,5,2,4,32};
    int a=13;
        System.out.println("Element present in array "+linearSearch(arr,a));
    }
    public static boolean linearSearch(int arr[],int target){
        if(arr.length==0){
            return false;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
