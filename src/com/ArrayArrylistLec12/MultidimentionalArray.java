package com.ArrayArrylistLec12;
import  java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("This is for Multidimentional Array. give number of rows");
        int r=sc.nextInt();
int arr[][]=new int[r][];
//        int arr[][]={
//                {1,2,3,4,5,6},
//                {5,6},
//                {7,8,9,0}
//        };
        for (int i = 0; i < r; i++) {
            System.out.println("Enter the number of columns for row " + (i + 1));
            int c = sc.nextInt();
            arr[i] = new int[c]; // Initializing the row with the number of columns
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col < arr[row].length;col++){
                 arr[row][col]=sc.nextInt();
            }
        }
        for(int[] row:arr){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }

    }
}
