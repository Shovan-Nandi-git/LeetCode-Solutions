class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minvalue=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minvalue){
                minvalue=prices[i];
            }
            int profit=prices[i]-minvalue;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}