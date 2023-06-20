// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

import java.util.*;


public class ans7 {
    public static boolean isMonotonic(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]) {
                
                for(int j = i + 1; j < nums.length - 1; j++){
                    if(nums[j] > nums[j + 1]) return false;
                }

                return true;
            }else if(nums[i] > nums[i + 1]) {
                
                for(int j = i + 1; j < nums.length - 1; j++){
                    if(nums[j] < nums[j + 1]) return false;
                }

                return true;
            }
        }

        return true;
    }
    public static void main(String args[]){
       int[] nums = {1,2,2,3};
       
       System.out.println(isMonotonic(nums));
    }
}
