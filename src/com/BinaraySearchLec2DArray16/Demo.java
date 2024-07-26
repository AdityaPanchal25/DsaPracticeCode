package KunalKushvaYT.DSAPracticeCode.src.com.BinaraySearchLec2DArray16;

import java.util.Arrays;

public class Demo {
    public static void main(String args[]){
        int [][]arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(searchMatrix(arr,35)));
    }
    static int[]  searchMatrix(int [][]matrix,int target){
        int r=0;
        int col=matrix.length-1;
        while(r<matrix.length&&col>=0){

            if(matrix[r][col]==target){
                return new int[]{r,col};
            }
            if(matrix[r][col]<target){
                r++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
