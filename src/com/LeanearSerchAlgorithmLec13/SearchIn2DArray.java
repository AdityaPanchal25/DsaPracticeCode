package com.LeanearSerchAlgorithmLec13;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String args[]){
        int arr[][]={
                {1,2,3,4,5},
                {2,3,4,5,6,7},
                {23,34,2}
        };
//        int target=34;

      int []ans=  search(arr,23);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int arr[][], int target){

            for( int row=0;row<arr.length;row++){
                for(int col=0;col<arr[row].length;col++){
                    if(arr[row][col]==target){
                        return new int[]{row,col};
                }
            }
        }
            return new int[]{-1,-1};
    }
}
