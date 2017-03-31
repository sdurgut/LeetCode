

/**
 * Created by sdurgut on 3/31/17.
 */

public class InvertBinaryTree
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

	public static TreeNode invertTree(TreeNode root)
	{

		if(root == null) return null;

		if (root.right != null || root.left != null)
		{
			TreeNode tmp = root.right;
			root.right = root.left;
			root.left = tmp;
			invertTree(root.right);
			invertTree(root.left);

		}

		return root;

	}

	public static void main(String[] args)
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
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		invertTree(root);
		System.out.println(root.left.get_data());
	}
}
