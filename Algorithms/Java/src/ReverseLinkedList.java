/**
 * Created by sdurgut on 4/24/17.
 */
public class ReverseLinkedList
{
	static class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
		}
	}

	/**
	 * Original List = 0->1->2->3->4
	 */

	/*
	public static ListNode reverseList(ListNode head)
	{
		if(head == null || head.next == null) return head;

		ListNode reverseHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		// System.out.println(head.val); // prints backwards

		return reverseHead;
	}
	*/
	public static ListNode reverseList(ListNode head)
{
	if (head == null || head.next == null) return head;
	ListNode prev = null;
	ListNode current = head;
	ListNode next = head.next;

	while (next != null)
	{
		next  = current.next;
		current.next = prev;
		prev = current;
		current = next;
	}
	return prev;
}


	public static void main(String[] args)
	{
		ListNode root = new ListNode(0);
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		root.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		ListNode reverse = reverseList(root);

		while (reverse.next != null)
		{
			System.out.print(reverse.val + "->");
			reverse = reverse.next;
		}
		System.out.print("null");
	}
}
