class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int x=0;
        for(int i=0;i<arr1.length;i++){
            x=0;
            for(int j=0;j<arr2.length;j++){
                int diff=Math.abs(arr1[i]-arr2[j]);
                if(diff<=d){
                    j=arr2.length;
                }
                else{
                    x++;
                }
            }
            if(x==arr2.length){
                count++;
            }
        }
        return count;
    }
}