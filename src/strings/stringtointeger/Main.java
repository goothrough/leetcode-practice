package strings.stringtointeger;

public class Main {
	public static void main(String[] args) {

		String s = "42";

		Solution sol = new Solution();
		int result = sol.myAtoi(s);

		System.out.println(result);

	}
}

class Solution {
	public int myAtoi(String s) {

		int sign = 1;

		int i = 0;
		int n = s.length();

		long result = 0;

		// skip empty letter
		while (i < n && s.charAt(i) == ' ') {
			i++;
		}

		// process the sign
		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			sign = s.charAt(i) == '+' ? 1 : -1;
			i++;
		}

		while (i < n && Character.isDigit(s.charAt(i))) {
			result = 10 * result + (s.charAt(i) - '0');

			if (result > Integer.MAX_VALUE) {
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			i++;
		}

		return (int) (sign * result);

	}
}