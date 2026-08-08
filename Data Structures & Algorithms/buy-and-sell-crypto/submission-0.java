class Solution {
    public int maxProfit(int[] prices) {
        int price_buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
             // If we find a new lowest price, update our buy price
            if (prices[i]<price_buy){
                price_buy = prices[i];
            }
            // Otherwise, check if selling today yields a better profit
            else if (prices[i]-price_buy > profit){
                profit=prices[i]-price_buy;
            }
        }
        return profit; 
    }
}
