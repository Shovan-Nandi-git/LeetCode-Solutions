class Solution {
    public int maxProfit(int[] prices) {
        int bye=Integer.MAX_VALUE;
        int n=prices.length;
        int profit=0;
        for(int i=0;i<n-1;i++){
            if(prices[i]>prices[i+1])
            continue;
            else if(bye>=prices[i]){
                bye=prices[i];
                if(bye<prices[i+1]){
                    profit=profit+(prices[i+1]-bye);
                    bye=prices[i+1];
                }
            }

        }
        return profit;
    }
}