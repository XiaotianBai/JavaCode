package com.Algorithm.LeetCode.Simple;

public class MaxProfit {
    public static void main(String[] args){
        int[] prices = {1,0,0,0,1,1,1,1};
        System.out.print(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        if(prices.length < 2) return 0;
        if(prices.length == 2) return prices[1] - prices[0] > 0? prices[1] - prices[0] : 0;
        int prepre = prices[0], prev = prices[1], cur = 0, low = prices[0], high = 0, ans = 0;
        for(int i = 2; i < prices.length; i++){
            cur = prices[i];
            if(prev <= prepre && prev <= cur && prev < low) low = prev;
            if(prev >= prepre && prev >= cur && ans < prev - low) ans = prev - low;
            prepre = prev;
            prev = cur;
        }
        if(cur - low > ans) ans = cur - low;
        return ans;
    }
}
