package tree.maximumdepthofbinarytree;

public class Main {
	public static void main(String[] args) {
		//		Integer[] array = { 3, 9, 20, null, null, 15, 7 };
		TreeNode givenNode = initilizeTreeNode();
		Solution s = new Solution();
		int result = s.maxDepth(givenNode);
		System.out.println(result);

	}

	public static TreeNode initilizeTreeNode() {

		TreeNode t3 = new TreeNode(3);
		TreeNode t9 = new TreeNode(9);
		TreeNode t20 = new TreeNode(20);
		TreeNode t15 = new TreeNode(15);
		TreeNode t7 = new TreeNode(7);

		t3.left = t9;
		t3.right = t20;
		t9.left = null;
		t9.right = null;
		t20.left = t15;
		t20.right = t7;
		t15.left = null;
		t15.right = null;
		t7.left = null;
		t7.right = null;

		return t3;
	}
}

class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int rightDepth = maxDepth(root.right);
		int leftDepth = maxDepth(root.left);

		return Math.max(rightDepth, leftDepth) + 1;
	}
}

// Definition for a binary tree node.
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
