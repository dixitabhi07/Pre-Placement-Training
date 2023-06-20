import java.util.*;

public class ans2 {
    
    public  static int distributeCandies(int[] candyType) {
        int res=0;
        int n=candyType.length;
        HashSet<Integer>set=new HashSet<>();
        for(int val:candyType){
            set.add(val);
        }
        if(set.size()>=n/2){
            res=n/2;
        }
        else{
            res=set.size();
        }
    return res;   
    }
    public static void main(String args[]){
        int[] candyType={1,1,2,2,3,3};
        int ans=distributeCandies(candyType);
        System.out.println(ans);
    }
}
    

