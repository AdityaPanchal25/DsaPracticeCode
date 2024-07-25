package com.BinarySearchLec14;

public class SearchElement {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,12,13};
        int target=8;
        System.out.println("Index of target element"+binarySearch(arr,target));
    }
    static int binarySearch(int arr[],int target){
        int start =0;
        int end=arr.length-1;//end

        while(start<=end){
            //        int mid=(start+end)/2;
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
