package linkedlist.linkedlistcycle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int[] headArray = { 1 };
		int p = -1;

		ListNode head = initializeListNode(headArray, p);

		Solution s = new Solution();
		boolean result = s.hasCycle(head);

		System.out.println(result);

	}

	public static ListNode initializeListNode(int[] head, int p) {

		List<ListNode> tmpList = new ArrayList<>();

		for (int i : head) {
			ListNode node = new ListNode(i);
			tmpList.add(node);
		}

		for (int i = 0; i < tmpList.size() - 1; i++) {
			tmpList.get(i).next = tmpList.get(i + 1);
		}

		if (p >= 0) {
			tmpList.get(tmpList.size() - 1).next = tmpList.get(p);
		}

		return tmpList.get(0);
	}

}

class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}

		ListNode fast = head;
		ListNode slow = head;

		while (fast.next != null && fast.next.next != null) {

			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				return true;
			}

		}

		return false;
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