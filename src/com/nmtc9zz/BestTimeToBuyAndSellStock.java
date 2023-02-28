package com.nmtc9zz;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int prices[]){
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrices){
                minPrices = prices[i];
            } else if(prices[i] - minPrices > maxProfit){
                maxProfit = prices[i] - minPrices;
            }
        }
        return maxProfit;
    }
}
