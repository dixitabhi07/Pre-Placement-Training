
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
// answer6

import java.util.*;
class ans6 {
    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        
        int []res=new int[n];
        for(int i=0;i<n;i++){
             int k=nums[i]*nums[i];
             res[i]=k;
        }
    Arrays.sort(res);
    return res;
        
    }
    public static void main(String args[]){
        int[] nums={-4,-1,0,3,10};
        int[] ans=sortedSquares(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}