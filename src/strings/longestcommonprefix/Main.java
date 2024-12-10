package strings.longestcommonprefix;

public class Main {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		Solution s = new Solution();
		String result = s.longestCommonPrefix(strs);
		System.out.println(result);

	}

}

class Solution {
	public String longestCommonPrefix(String[] strs) {

		String commonPrefix = strs[0];

		for (int i = 0; i < strs.length; i++) {

			while (!strs[i].startsWith(commonPrefix)) {
				commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
				if (commonPrefix.isEmpty()) {
					return "";
				}
			}

		}

		return commonPrefix;
	}
}