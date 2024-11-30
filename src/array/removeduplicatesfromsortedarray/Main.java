package array.removeduplicatesfromsortedarray;

public class Main {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = { 1, 1, 2 };
		int result = s.removeDuplicates(nums);
		System.out.println(result);
	}
}

class Solution {
	public int removeDuplicates(int[] nums) {
		int i = 0;

		for (int j = 1; j < nums.length; j++) {
			// compare
			if (nums[i] == nums[j]) {
				// skip
				continue;
			}

			// update the array
			i++;
			nums[i] = nums[j];
		}

		return i + 1;
	}
}
