/**
 * Created by sdurgut on 5/9/17.
 */

public class SubtreeofAnotherTree
{
	static class TreeNode
	{
		int val;
		TreeNode right;
		TreeNode left;

		TreeNode(int x)
		{
			val = x;
		}
	}
	// check whether t is a subtree of s
	public static boolean isSubtree(TreeNode s, TreeNode t)
	{
		if (s==null) return false;
		if(isSame(s,t)) return true;
		return isSubtree(s.left,t) || isSubtree(s.right,t);
	}

	public static boolean isSame(TreeNode s, TreeNode t)
	{
		if (s==null && t==null) return true;
		if (s==null || t==null) return false;
		if(s.val != t.val) return false;
		return isSame(s.left,t.left) && isSame(s.right,t.right);
	}

	public static void main(String [] args)
	{
		TreeNode s = new TreeNode(3);
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(1);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(0);
		s.left = n1;
		s.right = n2;
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

		TreeNode t = new TreeNode(4);
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(0);

		t.left = t1;
		t.right = t2;
		t2.left = t3;


		System.out.println(isSubtree(s,t));


	}

}
