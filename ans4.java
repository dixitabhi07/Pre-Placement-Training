
// Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in
// order.

// You must write an algorithm with O(log n) runtime complexity.

import java.util.*;
public class ans4 {
    
    public static  int searchInsert(int[] nums, int target) {
        int k=0;
        ArrayList<Integer> set= new ArrayList<>();
         for(int val:nums){
             set.add(val);
         }
        // for(int i=0;i<nums.length;i++){
        //     if(!set.contains(arr[i])){
        //         set.add(arr[i]);
        //     }
        // }
        for(int i=0;i<nums.length;i++){
            if(set.get(i)==target){
                k=i;
            }
            else{
                if(set.get(i)<target){
                    k=i+1;
                }
            }
        }
        return k;
        


        
    }
   public static void main(String args[]){
        int[] nums ={1,3,5,6};
        int target = 5;
       
         System.out.println(searchInsert(nums, target));


    }
}
    

