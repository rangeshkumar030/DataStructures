package org.example.arrays;


//https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1
public class StockBuyandSellMultipleTransactionAllowed {

    public int maximumProfit(int prices[]) {
        // code here
        int profit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;

    }
}
