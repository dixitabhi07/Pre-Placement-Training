// answer8
import java.util.*;
class ans8{
    public static  int[] shuffle(int[] nums, int n) {
        int [] res=new int[2*n];
        int mid=n;
        int j=0;
        for(int i=0;i<n;i++){
            res[j]=nums[i];
            j=j+2;
        }
        int h=1;
        for(int k=n;k<2*n;k++){
            res[h]=nums[k];
            h=h+2;
        }
    return res;
    }
    public static void main(String args[]){
        int n = 3; 
        int[] nums = {2,5,1,3,4,7};
         int[] ans=shuffle(nums, n);
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}