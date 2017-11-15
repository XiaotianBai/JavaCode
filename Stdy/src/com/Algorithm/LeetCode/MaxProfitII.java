package com.Algorithm.LeetCode;

public class MaxProfitII {
    public static void main(String[] args){
        int[] prices = {1,2,3,4,5,1,5,4};
        System.out.print(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        int profit = 0, buyPrice = 0, sellPrice = 0;
        boolean hasStock = false;
        for(int i = 0; i < prices.length - 1; i++){
            if(!hasStock && prices[i+1] > prices[i]){
                buyPrice = prices[i];
                hasStock = true;
            }
            if(hasStock && prices[i+1] < prices[i]){
                sellPrice = prices[i];
                profit += sellPrice - buyPrice;
                hasStock = false;
            }
        }
        if(hasStock)profit += prices[prices.length -1] - buyPrice;
        return profit;
    }
}
