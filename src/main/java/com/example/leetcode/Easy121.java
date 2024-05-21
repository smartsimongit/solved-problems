package com.example.leetcode;

public class Easy121 {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        int temp = 0;

        if (prices.length == 1) {
            return maxProfit;
        }
        while (right < prices.length) {

            temp = prices[right] - prices[left];
            if (temp > maxProfit) {
                maxProfit = temp;
            }
            if (prices[right] < prices[left]) {
                right = left;
                left = right + 1;
            }
            right++;
        }
        return maxProfit;
    }
}
