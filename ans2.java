// Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

// - answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
// - answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

import java.util.*;
class ans2{
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
     
     HashSet<Integer> set1=new HashSet<Integer>();
      HashSet<Integer> set2=new HashSet<Integer>();

     for(int ele: nums1){
         set1.add(ele);
     }

     for(int ele:nums2){
         set2.add(ele);
     }


     List<List<Integer>> list=new ArrayList<>();
      
      ArrayList<Integer> l1=new ArrayList<>();
      
      ArrayList<Integer> l2=new ArrayList<>();

     for(int ele:set2){

         if(set1.contains(ele)==false){
           l1.add(ele);
         }
     }


       for(int ele:set1){

         if(set2.contains(ele)==false){
           l2.add(ele);
         }
     }
       

       list.add(l2);
       list.add(l1);
       return list;
    }
    public static void main(String args[]) {
    int []arr1 = {1,2,3};
    int[]arr2 = {2,4,6};
    
    System.out.println(findDifference(arr1, arr2));
}
}
