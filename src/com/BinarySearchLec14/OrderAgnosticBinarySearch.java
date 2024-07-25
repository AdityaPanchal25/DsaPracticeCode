package com.BinarySearchLec14;

public class OrderAgnosticBinarySearch {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,12,13};
        int target=8;
        System.out.println("Index of target element"+orderAgnostic(arr,target));
    }
    static int orderAgnostic(int arr[],int target){
        int start =0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            //        int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
            else{
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
