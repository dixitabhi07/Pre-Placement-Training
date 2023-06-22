import java.io.*;
import java.lang.*;
import java.util.Arrays;
 
class ans6{
    
    public static boolean containsDuplicate(int[] nums) {
 
        
        for(int index = 1; index < nums.length; index++) {
            if(nums[index ] == nums[index - 1]) {
                return true;
            }
        }
 
        return false;
    }
    
    public static void main (String[] args) {
	    
	Solution sol= new Solution();
	    
	int nums[]= {1, 2, 3, 1};
	    
	boolean res = sol.containsDuplicate(nums);
	    
	System.out.println(res);
    }
}
