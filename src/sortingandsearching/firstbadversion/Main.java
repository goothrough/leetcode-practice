package sortingandsearching.firstbadversion;

public class Main {
	public static void main(String[] args) {

		Solution s = new Solution();
		int n = 1;
		int result = s.firstBadVersion(n);
		System.out.println(result);
	}
}

class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int left = 1;
		int right = n;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}

		return left;
	}
}

class VersionControl {
	boolean isBadVersion(int version) {

		return version >= 1;

	}
}