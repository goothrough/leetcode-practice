package dynamicprogramming.climbingstairs;

public class Main {
	public static void main(String[] args) {

		int n = 3;

		Solution s = new Solution();
		int result = s.climbStairs(n);

		System.out.println(result);

	}
}

class Solution {
	public int climbStairs(int n) {

		if (n == 1) {
			return 1;
		}

		int[] dp = new int[n + 1];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}

		return dp[n];
	}

	public int climbStairsEfficiently(int n) {

		if (n == 1) {
			return 1;
		}

		int first = 1;
		int second = 2;

		for (int i = 3; i <= n; i++) {
			int current = first + second;
			first = second;
			second = current;
		}

		return second;
	}
}