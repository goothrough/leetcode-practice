package array.plusone;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		Solution s = new Solution();

		int[] result = s.plusOne(digits);
		System.out.println(Arrays.toString(result));

	}
}

class Solution {
	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;

			if (digits[i] < 10) {
				return digits;
			}

			digits[i] = 0;
		}

		int[] result = new int[digits.length + 1];
		result[0] = 1;

		return result;
	}

}