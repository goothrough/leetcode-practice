package array.singlenumber;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2 };

		Solution s = new Solution();

		int result = s.singleNumber(nums);
		System.out.println(result);
	}
}

class Solution {
	public int singleNumber(int[] nums) {

		int result = 0;

		for (int num : nums) {
			result = result ^ num;
		}

		return result;

	}
}