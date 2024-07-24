package com.LeanearSerchAlgorithmLec13;

public class LeetCode1295EvenNumDigiNumCountArray {
    public static void main(String args[]){
        int arr[]={12,123,1455,123};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count=0;

        for(int i=0; i<nums.length;i++){

            int cd=0;
            while(nums[i]>0){
                cd++;
                nums[i]=nums[i]/10;
            }
            if(cd%2==0){
                count++;
                cd=0;
            }
            else{
                cd=0;
            }
        }
        return count;
    }
}
