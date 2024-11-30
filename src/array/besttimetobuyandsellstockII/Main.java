package array.besttimetobuyandsellstockII;

public class Main {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		Solution s = new Solution();

		int maxProfit = s.maxProfit(prices);

		System.out.println(maxProfit);
	}

}

class Solution {
	public int maxProfit(int[] prices) {

		int profit = 0;

		for (int i = 1; i < prices.length; i++) {
			int expectedProfit = prices[i] - prices[i - 1];

			if (expectedProfit < 0) {
				continue;
			}

			profit += expectedProfit;
		}

		return profit;

	}
}