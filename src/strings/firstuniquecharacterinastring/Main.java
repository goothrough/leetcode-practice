package strings.firstuniquecharacterinastring;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String s = "loveleetcode";

		Solution sol = new Solution();
		int result = sol.firstUniqChar(s);
		System.out.println(result);

	}
}

class Solution {
	public int firstUniqChar(String s) {

		Map<Character, Integer> charToCount = new HashMap<>();

		for (char c : s.toCharArray()) {
			charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (charToCount.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}
}