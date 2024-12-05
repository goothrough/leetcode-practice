package strings.validanagram;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		Solution sol = new Solution();
		boolean isAnagram = sol.isAnagram(s, t);
		System.out.println(isAnagram);

	}
}

class Solution {
	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);

		return Arrays.equals(sChar, tChar);

	}
}
