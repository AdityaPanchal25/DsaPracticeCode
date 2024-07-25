package com.LeanearSerchAlgorithmLec13.L1672;

public class RichestCustomerWealth2d {
    public static void main(String args[]){
        int arr[][]={
                {12,1,23,23},
                {1,2,3,},
                {1,2},
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int richest=Integer.MIN_VALUE;
        for(int row=0;row<accounts.length;row++){
            int wealth=0;
            for(int col=0;col<accounts[row].length;col++)
            {
                wealth=wealth+accounts[row][col];
            }
            if(richest<wealth){
                richest=wealth;
                wealth=0;
            }
        }

        return richest;
    }

}
