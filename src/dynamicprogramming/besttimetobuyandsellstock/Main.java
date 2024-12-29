package dynamicprogramming.besttimetobuyandsellstock;

public class Main {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		Solution s = new Solution();
		int result = s.maxProfit(prices);
		System.out.println(result);
	}
}

class Solution {
	public int maxProfit(int[] prices) {

		int buyPrice = Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (buyPrice > prices[i]) {
				buyPrice = prices[i];
			}

			int tmpProfit = prices[i] - buyPrice;
			if (profit < tmpProfit) {
				profit = tmpProfit;
			}
		}

		return profit;
	}
}