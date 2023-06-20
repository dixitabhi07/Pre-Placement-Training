// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

import java.util.*;
public class ans5 {
    
    public static int maximumProduct(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);  
    }
    public static void main(String args[]){
       int[] nums= {1,2,3};
       System.out.println(maximumProduct(nums));
    }
}
    
