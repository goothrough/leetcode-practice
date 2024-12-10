package linkedlist.deletenodeinalinkedlist;

public class Main {

	public static void main(String[] args) {
		ListNode first = new ListNode(4);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(1);
		ListNode forth = new ListNode(9);
		first.next = second;
		second.next = third;
		third.next = forth;

		Solution s = new Solution();
		s.deleteNode(second);

		ListNode current = first;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}

	}

}

class Solution {
	public void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}