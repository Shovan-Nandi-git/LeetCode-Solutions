class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        int sum=0;
        int i=0;
        while(n>0){
            int degit=n%10;
            n/=10;
            if(degit!=0){
                ans=ans+degit*(int)Math.pow(10,i);
                sum+=degit;
                i++;
            }
        }
        return ans*sum;
    }
}
