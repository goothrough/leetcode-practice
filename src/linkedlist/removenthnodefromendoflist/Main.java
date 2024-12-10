package linkedlist.removenthnodefromendoflist;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		int[] head = { 1, 2, 3, 4, 5 };
		ListNode givenNode = initializeListNode(head);

		Solution s = new Solution();
		s.removeNthFromEnd(givenNode, 2);

		while (givenNode != null) {
			System.out.println(givenNode.val);
			givenNode = givenNode.next;
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
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode fast = dummy;
		ListNode slow = dummy;

		for (int i = 0; i <= n; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return dummy.next;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
