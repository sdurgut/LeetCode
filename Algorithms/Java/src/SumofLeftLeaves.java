/**
 * Created by sdurgut on 4/14/17.
 */
public class SumofLeftLeaves
{
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

	public static int sumOfLeftLeaves(TreeNode root)
	{
		if (root == null) return 0;
		int sum = 0;
		if (root.left != null)
		{
			if(root.left.left == null && root.left.right == null) sum += root.left.val;
			else sum += sumOfLeftLeaves(root.left);
		}
		sum += sumOfLeftLeaves(root.right);

		return sum;
	}

	public static void main(String[] args)
	{
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		System.out.println(sumOfLeftLeaves(rootNode));
	}
}
