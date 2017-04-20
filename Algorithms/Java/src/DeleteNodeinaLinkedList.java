/**
 * Created by sdurgut on 4/20/17.
 */
public class DeleteNodeinaLinkedList
{
	// this question was a weird one by leetcode but I wrote it with a little bit different
	static class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
		}
	}
	public static void deleteNode(ListNode root, int val)
	{
		if(root == null) return;

		while(root.next != null)
		{
			if(root.next.val == val)
			{
				if(root.next.next != null) root.next = root.next.next;
				else root.next = null;

			}

			root = root.next;

		}

	}

	public static void printNode(ListNode root)
	{

		if(root == null) return;
		while(root != null)
		{
			System.out.println(root.val);
			root = root.next;
		}
	}

	public static void main(String[] args)
	{
		ListNode root = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;


		printNode(root);
		// System.out.println("#########################");
		deleteNode(root,3);
		printNode(root);
	}
}
