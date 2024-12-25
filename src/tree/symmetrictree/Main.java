package tree.symmetrictree;

public class Main {
	public static void main(String[] args) {
		TreeNode givenNode = initilizeTreeNode();
		Solution s = new Solution();

		boolean result = s.isSymmetric(givenNode);
		System.out.println(result);

	}

	public static TreeNode initilizeTreeNode() {

		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(3);

		t1.left = t2;
		t2.left = t4;
		t2.right = t5;
		t1.right = t3;
		t3.left = t6;
		t3.right = t7;

		return t1;
	}
}

class Solution {
	public boolean isSymmetric(TreeNode root) {

		return isMirror(root.left, root.right);

	}

	private boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}

		if (t1 == null || t2 == null) {
			return false;
		}

		return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
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
	}
}