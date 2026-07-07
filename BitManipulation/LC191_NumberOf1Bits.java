class Solution {
    public int hammingWeight(int n) {
        int ans=0;
        while(n>0){
            int x=n & 1;
            if(x==1){
                ans+=1;
            }
            n/=2;
        }
        return ans;
    }
}