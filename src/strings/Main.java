package strings;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };

		Solution sol = new Solution();
		sol.reverseString(s);

		System.out.println(Arrays.toString(s));
	}
}

class Solution {
	public void reverseString(char[] s) {

		for (int i = 0; i < s.length; i++) {
			int start = i;
			int end = s.length - 1 - i;

			if (start >= end) {
				return;
			}

			char tmp = s[start];
			s[start] = s[end];
			s[end] = tmp;
		}

	}
}