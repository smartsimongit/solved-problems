package com.example.leetcode;

public class Medium122 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                int val = prices[i + 1] - prices[i];
                profit += val;
            }
        }
        return profit;
    }

//       Best Way
//
//    public int maxProfit(int[] prices) {
//        int profit = 0;
//        int price = prices[0];
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > price) {
//                profit += prices[i] - price;
//            }
//            price = prices[i];
//        }
//        return profit;
//    }
}
