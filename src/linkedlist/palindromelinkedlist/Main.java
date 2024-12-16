package linkedlist.palindromelinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		int[] headArray = { 1, 2, 2, 1 };
		ListNode head = initializeListNode(headArray);

		Solution s = new Solution();
		boolean result = s.isPalindrome(head);
		System.out.println(result);

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
	public boolean isPalindrome(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		// until the fast reaches the last node
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		ListNode reversedHalf = reverseListNode(slow);

		while (reversedHalf != null) {
			if (head.val != reversedHalf.val) {
				return false;
			}

			head = head.next;
			reversedHalf = reversedHalf.next;
		}

		return true;

	}

	private ListNode reverseListNode(ListNode half) {
		ListNode prev = null;
		ListNode current = half;

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