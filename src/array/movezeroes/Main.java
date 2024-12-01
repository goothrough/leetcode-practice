package array.movezeroes;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };

		Solution s = new Solution();
		s.moveZeroes(nums);

		System.out.println(Arrays.toString(nums));

	}
}

class Solution {
	public void moveZeroes(int[] nums) {

		int lastNoneZeroIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[lastNoneZeroIndex] = nums[i];
				lastNoneZeroIndex++;
			}
		}

		for (int i = lastNoneZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}

	}
}