class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int j=0;
        int i=0;
        while(i<m){
            if(matrix[i][j]==target){
                return true;

            }
            else if(matrix[i][j]>target){
                return false;
            }
            else{
                for(int h=0;h<n;h++){
                        if(matrix[i][h]==target){
                            return true;
                        }
                    }
                i++;
                }           
            

        }
    
        
    
    return false;
    }
}