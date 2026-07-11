class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a=matrix.length;
        int b=matrix[0].length;
        int left=0;
        int right=a-1;
        int mid=0;
        while(left<=right ){
            mid=left+(right-left)/2;
            if(matrix[mid][0]<=target && matrix [mid][b-1]>=target){
                for(int j=0 ; j<b; j++){
                    if(matrix[mid][j]==target){
                        return true;
                    }
                }
                return false;
            }
            else if(matrix[mid][0]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        
        return false;
    }
}