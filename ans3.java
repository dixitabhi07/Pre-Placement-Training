class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        
        int []res=new int[n];
        for(int i=0;i<n;i++){
             int k=nums[i]*nums[i];
             res[i]=k;
        }
    Arrays.sort(res);
    return res;
        
    }
}