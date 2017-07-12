/**
 * Created by sdurgut on 7/11/17.
 */

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x)
	{
		val = x;
	}
}

public class DiameterofBinaryTree
{
	private  int max = 0;
	public  int diameterOfBinaryTree(TreeNode root)
	{
		maxDepth(root);
		return max;


	}

	public  int maxDepth(TreeNode root)
	{
		if ( root == null ) return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left+right);

		return 1+Math.max(left,right);
	}

	public static void main(String [] args)
	{

		DiameterofBinaryTree solution = new DiameterofBinaryTree();

		TreeNode root = new TreeNode(3);
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(1);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(0);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n4.left = n5;
		//                         3
		//                       /  \
		//                      4    5
		//                    /  \
		//                   1    2
		//                       /
		//                      0

//		assert(solution.diameterOfBinaryTree(root)== 100);
		System.out.println(solution.diameterOfBinaryTree(root));
	}


}
