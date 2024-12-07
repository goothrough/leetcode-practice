package strings.implementstrstr;

public class Main {
	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";

		Solution s = new Solution();
		int result = s.strStr(haystack, needle);
		System.out.println(result);

	}
}

class Solution {
	public int strStr(String haystack, String needle) {

		return haystack.indexOf(needle);
	}
}