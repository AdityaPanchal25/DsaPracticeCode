package com.BinarySearchLec14;

// find the equal or just smaller number
public class floorNumber {
    public static void main(String args[]){
        int arr[]={2,3,4,5,12,14,18,21,27};
        int target=4;
        System.out.println(floorNumber(arr,target));
    }
    public static int floorNumber(int arr[],int target){
        int start=0;
        int end=arr.length;


        while(start<=end){
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
return arr[end];

    }
}
