/**
 * Created by sdurgut on 4/7/17.
 */
public class MinimumAbsoluteDifferenceinBST
{
	// keep the treenode class only for this java program. // hidden from other files.
	static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x)
		{
			val = x;
		}

		int get_data()
		{
			return val;
		}
	}


	int minDiff = Integer.MAX_VALUE;
	TreeNode prevNode;

	public int getMinimumDifference(TreeNode root)
	{
		inorder(root);
		return minDiff;
	}

	public void inorder(TreeNode root)
	{
		if(root == null) return;
		inorder(root.left);
		if(prevNode!= null)
		{
			minDiff = Math.min(minDiff, root.val - prevNode.val);
		}
		prevNode = root;
		inorder(root.right);

	}

	public static void main(String[] args)
	{
		TreeNode root = createBinaryTree();
		MinimumAbsoluteDifferenceinBST myMinAbsDiff  = new MinimumAbsoluteDifferenceinBST();
		int myDiff = myMinAbsDiff.getMinimumDifference(root);
		System.out.println(myDiff);


	}

	public static TreeNode createBinaryTree()
	{

		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);

		rootNode.left=node20;
		rootNode.right=node60;

		node20.left=node10;
		node20.right=node30;

		node60.left=node50;
		node60.right=node70;

		return rootNode;
	}

}
