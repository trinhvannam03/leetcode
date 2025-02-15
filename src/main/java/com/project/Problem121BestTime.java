package com.project;

import java.util.ArrayList;
import java.util.List;

public class Problem121BestTime {
    public static void main(String[] args) {

    }
}

//Input: prices = [5,1,2,9,2,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        List<Position> vals = new ArrayList<>();

        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[0]) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[0]);
            }
        }
        return maxProfit;
    }
}

class Position {
    int maxProfit;
    int index;
}