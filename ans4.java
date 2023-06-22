
import java.util.*;

class ans1 {
    
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length;i+=2){
            max=max+Math.min(nums[i],nums[i+1]);
        }
        return max;

        
    }
    public static void main(String args[]){
        int[] nums={1,4,3,2};
        int res=arrayPairSum(nums);
        System.out.println(res);
    }
}
    