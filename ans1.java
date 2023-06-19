
import java.util.HashMap;
import java.util.Map;
class ans1{

    public static int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
      
        Map<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++) {
         
            if (map.containsKey(nums[i])) {
                
                result[0] = i;
               
                result[1] = map.get(nums[i]);
            }
         
            else {
                
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
public static void main(String args[]){
    int nums[]={2,7,11,15};
    int target=9;
    int []ans=new int[2];
    ans=twoSum(nums,target);
    System.out.print(ans[0]);
    System.out.print(" ");
    System.out.print(ans[1]);
    System.out.println();

 }
}
