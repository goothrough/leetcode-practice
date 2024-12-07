package strings.validpalindrome;

public class Main {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";

		Solution sol = new Solution();

		boolean isPalindrome = sol.isPalindrome(s);
		System.out.println(isPalindrome);
	}
}

class Solution {
	public boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			// skip empty or non-alphanumerical letter
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			// skip empty or non-alphanumerical letter
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}

			left++;
			right--;

		}

		return true;
	}
}
