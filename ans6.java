class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
         HashSet<Integer> res=new HashSet<>();
         if(nums.length==0){
             return null;
         }
        for(int i=0;i<nums.length;i++){
            if(!map.contains(nums[i])){
                map.add(nums[i]);

            }
            else{
             res.add(nums[i]);   
            }
        }
    List<Integer> ans=new ArrayList<>();
    for(int val:res){
        ans.add(val);
    }
    return ans;
    }
}