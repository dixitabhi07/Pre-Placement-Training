// Answer 5

import java.util.*;

public class ans5 {
    
    public  static int[] plusOne(int[] digits) {

        int i = digits.length - 1;

        while (i >=0 && digits[i] == 9) {
            i --;
        }
        

        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        

        int[] result = new int[digits.length];
        
        result[i] = digits[i] + 1;
        for (int j = 0; j < i; j ++) {
            result[j] = digits[j];
        }
        
        return result;
        
    }
public static void main(String args[]){
    int nums[]={1,2,3};
    
    int []ans=new int[nums.length];
    ans=plusOne(nums);
    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
    }

 }
}