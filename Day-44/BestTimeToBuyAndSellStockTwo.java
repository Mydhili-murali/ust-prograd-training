//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//        Find and return the maximum profit you can achieve.
class BestTimeToBuyAndSellStockTwo{
    public int maxProfit(int[] prices) {
        int i,sum=0;
        for(i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                sum=sum+prices[i+1]-prices[i];
            }
        }
        return sum;

    }
}