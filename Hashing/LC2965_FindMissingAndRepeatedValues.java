class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a=grid.length*grid.length;
        int sum=(a*(a+1))/2;
        int[]frequency=new int[a];
        int[]ans=new int[2];
        ans[1]=sum;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                ans[1]-=grid[i][j];
                frequency[grid[i][j]-1]+=1;
                if(frequency[grid[i][j]-1]==2){
                    ans[0]=grid[i][j];
                }
            }
        }
        ans[1]+=ans[0];
        return ans;
    }
}