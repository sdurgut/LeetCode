/**
 * Created by sdurgut on 4/13/17.
 */
public class PopulatingNextRightPointersinEachNode
{
	// keep the treenode class only for this java program. // hidden from other files.
	static class TreeLinkNode
	{
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x)
		{
			val = x;
		}
	}

	public static void connect(TreeLinkNode root)
	{
		if(root==null) return;

		if(root.left != null) // lets say you are at 20
		{

			root.left.next = root.right; // 20 points to 60

		}
		if(root.right != null)
		{
			if(root.next!= null) // 20.next is not null
			{
				root.right.next = root.next.left; // 20->30.next == 20->60.right // 30 points to 50
			}
			else // 40.next is null, then 60.next becomes null
			{
				root.right.next = null;
			}

		}
		connect(root.left);
		connect(root.right);

	}

	public static void main(String[] args)
	{

		TreeLinkNode rootNode =new TreeLinkNode(40);
		TreeLinkNode node20=new TreeLinkNode(20);
		TreeLinkNode node10=new TreeLinkNode(10);
		TreeLinkNode node30=new TreeLinkNode(30);
		TreeLinkNode node60=new TreeLinkNode(60);
		TreeLinkNode node50=new TreeLinkNode(50);
		TreeLinkNode node70=new TreeLinkNode(70);

		rootNode.left=node20;
		rootNode.right=node60;

		node20.left=node10;
		node20.right=node30;

		node60.left=node50;
		node60.right=node70;

		// tree is
		/**
		 *                     40
		 *                20        60
		 *             10   30   50   70
		 */

		connect(rootNode);

		System.out.println(rootNode.left.left.next.val); // print 30






	}
}
