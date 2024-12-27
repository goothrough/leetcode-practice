package tree.binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		TreeNode givenNode = initilizeTreeNode();
		Solution s = new Solution();
		List<List<Integer>> result = s.levelOrder(givenNode);
		result.forEach(level -> {
			level.forEach(System.out::print);
			System.out.println();
		});
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
	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> rtnList = new ArrayList<>();

		if (root == null) {
			return rtnList;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {

			int levelNodeCount = queue.size();
			List<Integer> currentLevelVal = new ArrayList<>();

			for (int i = 0; i < levelNodeCount; i++) {
				TreeNode currentNode = queue.poll();
				currentLevelVal.add(currentNode.val);

				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}

				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}

			}

			rtnList.add(currentLevelVal);

		}

		return rtnList;

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