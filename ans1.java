// Given an integer array nums of length n and an integer target, find three integers
// in nums such that the sum is closest to the target.
// Return the sum of the three integers.  Answer 1

import java.util.*;
class ans1{
    
    public static int closestSum(int A[], int N, int X)
      {
        Arrays.sort(A);
        int mindiff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<N;i++)
        {
            int j=i+1;
            int k=N-1;
            while(j<k)
            {
                int sum=A[i]+A[j]+A[k];
                if(sum==X)
                {
                    return X;
                }
                else if(sum<X)
                {
                    int diff=X-sum;
                    if(diff<mindiff)
                    {
                        mindiff=diff;
                        ans=sum;
                    }
                    j++;
                }
                else
                {
                    int diff=sum-X;
                    if(diff<mindiff)
                    {
                        mindiff=diff;
                        ans=sum;
                    }
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums ={-1,2,1,-4};
        int target = 1;
         int N=nums.length;
         System.out.println(closestSum(nums, N, target));


    }
}
