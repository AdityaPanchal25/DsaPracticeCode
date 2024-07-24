package com.ArrayArrylistLec12;

import java.util.Scanner;

public class MultiDimentionArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        /* 1 2 3
           4 5 6
           7 8 9
         */
        int arr[][]=new int [3][];
        System.out.println(arr.length);

        for(int row=0;row<arr.length;row++ ){
            for(int col =0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
    }
}
