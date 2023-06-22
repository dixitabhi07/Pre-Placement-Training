// Question 7
// You are given an inclusive range [lower, upper] and a sorted unique integer array
// nums, where all elements are within the inclusive range.

// A number x is considered missing if x is in the range [lower, upper] and x is not in
// nums.

// Return the shortest sorted list of ranges that exactly covers all the missing
// numbers. That is, no element of nums is included in any of the ranges, and each
// missing number is covered by one of the ranges.

import java.util.*;
class ans7 {
  public static  List<String> summaryRanges(int[] nums) {
    int start, end, n = nums.length, i = 0;
    var ans = new ArrayList<String>();

    while (i<n) {
      for (start = end = nums[i]; i<n && end == nums[i]; i++, end++);

      ans.add(
        end == start + 1
          ? "" + start
          : String.format("%d->%d", start, end-1));
    }
    return ans;
  }

   public static void main(String args[]){
       int[] nums = {0,1,3,50,75};
       int lower = 0;
       int upper = 99;
       
       System.out.println(summaryRanges(nums));
    }
}