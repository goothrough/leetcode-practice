package array.intersectionoftwoarraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		Solution s = new Solution();
		int[] result = s.intersect(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}
}

class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		List<Integer> outputList = new ArrayList<Integer>();

		int i = 0;
		int j = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				outputList.add(nums1[i]);
				i++;
				j++;
				continue;
			}

			if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}

		return outputList.stream().mapToInt(v -> v.intValue()).toArray();

	}
}