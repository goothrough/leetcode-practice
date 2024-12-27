package tree.convertsortedarraytobinarysearchtree;

public class Main {
	public static void main(String[] args) {

		int[] givenArray = { -10, -3, 0, 5, 9 };
		Solution s = new Solution();
		TreeNode result = s.sortedArrayToBST(givenArray);

	}

}

class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {

		return generateBST(nums, 0, nums.length - 1);

	}

	private TreeNode generateBST(int[] nums, int leftIndex, int rightIndex) {

		if (leftIndex > rightIndex) {
			return null;
		}

		int mid = leftIndex + (rightIndex - leftIndex) / 2;

		TreeNode root = new TreeNode(nums[mid]);

		root.left = generateBST(nums, leftIndex, mid - 1);
		root.right = generateBST(nums, mid + 1, rightIndex);

		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
	}
}