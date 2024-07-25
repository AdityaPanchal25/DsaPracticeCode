package com.BinarySearchQuestionGFAM;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public interface L34FindFirstLastPositionofelement {
    public static void main(String args[]) {
        int nums[] = {5, 7, 7, 7, 8, 8, 18};
        int target=7;
System.out.println(searchRange(nums,target));
    }
        public static int[] searchRange(int[] nums, int target) {
            //check for first occurence if target first
            int arr[]={-1,-1};

            arr[0]=search(nums,target,true);
            if( arr[0] !=-1) {
                arr[1] = search(nums, target, false);
            }
            return arr;
        }

        //this function just return the index value of target
        public static int search(int[] nums, int target, boolean firstStartIndex){
            int ans=-1;
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                //find the middle element
                int mid=start+(end-start)/2;
                if(nums[mid]<target){
                    start=mid+1;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
//potential ans found
                    ans=mid;
                    if(firstStartIndex){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
            
            return ans;
        }
    }

