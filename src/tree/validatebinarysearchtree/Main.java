package tree.validatebinarysearchtree;

public class Main {
	public static void main(String[] args) {
		TreeNode givenNode = initilizeTreeNode();
		Solution s = new Solution();
		boolean result = s.isValidBST(givenNode);

		System.out.println(result);
	}

	public static TreeNode initilizeTreeNode() {

		TreeNode t2 = new TreeNode(2);
		TreeNode t1 = new TreeNode(1);
		TreeNode t3 = new TreeNode(3);

		t2.left = t1;
		t2.right = t3;

		return t2;
	}
}

class Solution {
	public boolean isValidBST(TreeNode root) {

		return isValid(root, null, null);

	}

	private boolean isValid(TreeNode node, Integer min, Integer max) {

		if (node == null) {
			return true;
		}

		if ((min != null && node.val <= min) || (max != null && max <= node.val)) {
			return false;
		}

		return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
	}
}

//Definition for a binary tree node.
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
		this.right = right;
	}
}