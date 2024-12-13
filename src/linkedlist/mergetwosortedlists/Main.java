package linkedlist.mergetwosortedlists;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] list1Array = { 1, 2, 4 };
		ListNode list1 = initializeListNode(list1Array);

		int[] list2Array = { 1, 3, 4 };
		ListNode list2 = initializeListNode(list2Array);

		Solution s = new Solution();
		ListNode result = s.mergeTwoLists(list1, list2);

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
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		return dummy.next;

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