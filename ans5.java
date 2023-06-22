

// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

// Given the integer n, return *the number of **complete rows** of the staircase you will build*.


import java.util.*;
class ans5 {
    public static int arrangeCoins(int n) {
        long i=0;
        for(i=1;i*(i+1)/2<=n;i++);
        return (int)i-1;
    }
     public static void main(String args[]){
        int n=5;
        System.out.println(arrangeCoins(n));
    }
}