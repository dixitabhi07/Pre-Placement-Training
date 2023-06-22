// Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
// return a sorted array of only the integers that appeared in all three arrays.


import java.util.*;


class ans1{
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {      
        ArrayList<Integer>res = new ArrayList<>();
        HashSet<Integer>a = new HashSet<>();
        HashSet<Integer>b = new HashSet<>();
        HashSet<Integer>c = new HashSet<>();
        for(Integer ele:A){
            a.add(ele);
        }
        for(Integer ele:B){
            b.add(ele);
        }
        for(Integer ele:C){
            c.add(ele);
        }
        HashSet<Integer>temp = new HashSet<>();
        for(Integer ele:B){
            if(a.contains(ele)){
                temp.add(ele);
            }
        }
        
        for(Integer ele:C){
            if(temp.contains(ele) && !res.contains(ele)){
                res.add(ele);
            }
        }
        return res;
    }

public static void main(String args[]) {
    int []arr1 = {1,2,3,4,5};
    int[]arr2 = {1,2,5,7,9};
    int[]arr3 = {1,3,4,5,8};
    System.out.println(commonElements(arr1, arr2, arr3, 5, 5, 5));
    
}
}