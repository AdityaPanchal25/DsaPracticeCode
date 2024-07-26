package KunalKushvaYT.DSAPracticeCode.src.com.BinaraySearchLec2DArray16;

import java.util.Arrays;

public class SearchInStrinklySortedArray {
    public static void main(String args[]){
        int arr[][]={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int target=13;
        System.out.println(Arrays.toString(searchElement(arr,target)));
    }
    static int[] searchElement(int [][]arr,int target){
        int r=0;
        int col=arr.length-1;
        if(arr[r][col]==target){
            return new int []{r,col};
        }
        if(arr[r][col]<target){

            col--;
        }else{
            r++;
        }
        return new int[]{-1,-1};
    }
}
