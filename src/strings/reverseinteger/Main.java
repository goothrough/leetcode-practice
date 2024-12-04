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

		while (x != 0) {
			int tmp = x % 10;
			reversedX = reversedX * 10 + tmp;
			x = x / 10;
			if (reversedX < Integer.MIN_VALUE || Integer.MAX_VALUE < reversedX) {
				return 0;
			}
		}

		return (int) reversedX;

	}
}