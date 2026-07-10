class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            return x*myPow(x,(-n-1));
        }
        
        if(n==1){
            return x;
        }
        else if(n==0){
            return 1;
        }
        double half=myPow(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}