package array.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		Solution s = new Solution();

		int[] result = s.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}

class Solution {
	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> complementToIndex = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (complementToIndex.containsKey(complement)) {
				return new int[] { i, complementToIndex.get(complement) };
			}

			complementToIndex.put(nums[i], i);

		}

		return null;
	}
}
