import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sdurgut on 4/20/17.
 */
public class SameTree
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
	/*
	// This solution does not work in one edge case for ex: [10,5,15] , [10,5,null,null,15]
	public static boolean isSameTree(TreeNode p, TreeNode q)
	{
		List<Integer> myListp = new ArrayList<Integer>();
		List<Integer> myListq = new ArrayList<Integer>();
		myListp = dfs(p);
		myListq = dfs(q);

		if(myListp.size() != myListq.size()) return false;
		else
		{
			for(int i = 0; i< myListp.size(); i++)
			{
				if(myListp.get(i) != myListq.get(i)) return false;
			}
		}

		return true;
	}

	public static List<Integer> dfs(TreeNode root)
	{
		List<Integer> myList = new ArrayList<Integer>();
		if(root == null) return myList;
		Stack<TreeNode> myStack = new Stack<TreeNode>();
		myStack.push(root);
		while(!myStack.empty())
		{
			TreeNode pop = myStack.pop();
			myList.add(pop.val);
			if(pop.left != null) myStack.push(pop.right);
			if(pop.right != null) myStack.push(pop.left);

		}
		return myList;
	}
	*/
	// better solution
	public static boolean isSameTree(TreeNode p, TreeNode q)
	{
		if(p == null && q == null) return true;
		if ( (p == null || q == null) && !(p == null && q == null) ) return false;
		return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}
	
	public static void main(String [] args)
	{
		TreeNode node0 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(0);
		TreeNode node4 = new TreeNode(1);
		TreeNode node5 = new TreeNode(2);
		node0.left = node1;
		node0.right = node2;
		node3.left = node4;
		node3.right = node5;

		System.out.println(isSameTree(node0,node3));

	}
}
