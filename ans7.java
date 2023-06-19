
// 💡  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array

import java.util.*;
 
public class ans7 {
    public static void main(String[] args)
    {
        int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        int n = A.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
              
                swap(A, j, i); 
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " "); 
        }
    }
 
    public static void swap(int[] A, int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}