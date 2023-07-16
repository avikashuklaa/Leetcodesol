class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int sell = 0;
        int buy = 0;
        int max = 0;
        for(int i=1; i<n; i++){
            if(prices[i] >= prices[i-1]){
                sell++;
            }
            else if(prices[i] < prices[i-1]){
                max += prices[sell] - prices[buy];
                buy = i;
                sell = i;
            }
        }
        max += prices[sell] - prices[buy];
        
        return max;
    }
}