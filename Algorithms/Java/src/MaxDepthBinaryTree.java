
/**
 * Created by sdurgut on 3/29/17.
 */


public class MaxDepthBinaryTree
{
	// keeps the TreeNode class only for this program
	static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x)
		{
			val = x;
		}
	}

	public static int maxDepth(TreeNode root)
	{
		if(root == null) return 0;
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}

	public static void main (String [] args)
	{
		TreeNode root = new TreeNode(0);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		root.left = n1;
		root.right= n2;
		n1.left = n3;
//		n1.right = n4;
//		n2.left = n5;
//		n2.right = n6;
		//                       root
		//                      /    \
		//                     n1     n2
		//                    /  \   /  \
		// ....

		System.out.println(maxDepth(root));


	}

}
