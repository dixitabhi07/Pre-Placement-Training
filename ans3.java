// Question 3
// We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence
// among all its possible subsequences.

// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
import java.util.*;

public class ans3 {

    public static int findLHS(int[] nums) {
     Arrays.sort(nums);
int left=0, right=1, result=0;


while(right<nums.length) { // move inside the nums.length
	int diff= nums[right]- nums[left];  // get the difference
	
	if(diff==1) { 
		result= Math.max(result, right-left+1);} 
	
	if(diff<=1) { // if diff is less than 1, move the window to the right
		right++;}
	
	else { // vice -versa
		left++;}}


return result;
   
    }
    public static void main(String args[]) {
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
        
    }
}
    
