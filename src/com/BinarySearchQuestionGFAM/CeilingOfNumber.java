package com.BinarySearchQuestionGFAM;

public class CeilingOfNumber {

    public static void main(String args[]){
        int arr[]={12,13,14,15,19,20,37,38,39,45};
        int target=36;
        System.out.println(ceilingOfNumber(arr,target));
    }
    //return the number or index of smallest no>=target
    public static int ceilingOfNumber(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
         mid=start+(end-start)/2;
        if(arr[mid]<target){
            start=mid+1;
        }
        else if(arr[mid]>target){
            end=mid-1;
        }
        else{
            return arr[mid];// as arr[mid]=target or ans
        }
        }
        return arr[start];
    }
}
