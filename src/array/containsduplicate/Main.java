package array.containsduplicate;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		Solution s = new Solution();
		boolean result = s.containsDuplicate(nums);
		System.out.println(result);

	}

}

class Solution {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}

		return false;
	}
}