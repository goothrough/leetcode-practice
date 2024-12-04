package strings.reverseinteger;

public class Main {
	public static void main(String[] args) {

		int x = -123;

		Solution s = new Solution();
		int result = s.reverse(x);
		System.out.println(result);

	}
}

class Solution {
	public int reverse(int x) {

		long reversedX = 0;

		int len = (int) (Math.log10(Math.abs(x)) + 1);

		for (int i = 0; i < len; i++) {
			int tmp = x % 10;
			reversedX += tmp * Math.pow(10, len - 1 - i);
			x = x / 10;
		}

		if (reversedX < -1 * Math.pow(2, 31) || Math.pow(2, 31) - 1 < reversedX) {
			return 0;
		}

		return (int) reversedX;

	}
}