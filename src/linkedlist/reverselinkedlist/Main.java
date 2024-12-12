package linkedlist.reverselinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] head = { 1, 2, 3, 4, 5 };
		ListNode givenNode = initializeListNode(head);

		Solution s = new Solution();
		ListNode result = s.reverseList(givenNode);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

	public static ListNode initializeListNode(int[] head) {

		List<ListNode> tmpList = new ArrayList<>();

		for (int i : head) {
			ListNode node = new ListNode(i);
			tmpList.add(node);
		}

		for (int i = 0; i < tmpList.size() - 1; i++) {
			tmpList.get(i).next = tmpList.get(i + 1);

		}

		return tmpList.get(0);
	}
}

class Solution {
	public ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode current = head;

		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}