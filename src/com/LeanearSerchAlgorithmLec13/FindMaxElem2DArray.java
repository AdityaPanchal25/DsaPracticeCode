package com.LeanearSerchAlgorithmLec13;

public class FindMaxElem2DArray {
    public static void main(String args[]){
    int arr[][]={
            {1,2,3,4,5},
            {6,7,78,99},
            {12,2,2}
    };
    System.out.println(checkMax(arr));
    }
    public static int checkMax(int arr[][]){
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>maxElement){
                    maxElement=arr[i][j];
                }
            }
        }
        return maxElement;
    }

}
