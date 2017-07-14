/**
 * Created by sdurgut on 7/12/17.
 */

public class ConvertSortedArraytoBinarySearchTree
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

	public TreeNode sortedArrayToBST(int[] nums)
	{
		if (nums.length==0) return null;

		TreeNode root  = makeTree(nums, 0,nums.length-1);

		return root;
	}

	public TreeNode makeTree(int[] nums, int low, int high)
	{
		if(low>high) return null;

		int mid = low + (high-low)/2;
		TreeNode myNode = new TreeNode(nums[mid]);
		myNode.left = makeTree(nums,low,mid-1);
		myNode.right = makeTree(nums,mid+1,high);
		return myNode;

	}

	public static void main(String[] args)
	{
		ConvertSortedArraytoBinarySearchTree solution = new ConvertSortedArraytoBinarySearchTree();
		int [] array = {1,2,3,4,5,6,7,8,9,10};

		TreeNode myTree = solution.sortedArrayToBST(array);
		System.out.println("AAAAAA");
	}

}
