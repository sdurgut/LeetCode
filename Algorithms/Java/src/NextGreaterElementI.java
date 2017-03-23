/**
 * Created by sdurgut on 3/23/17.
 */

public class NextGreaterElementI
{
	public static int[] nextGreaterElement(int[] findNums, int[] nums)
	{
		int [] result = new int[findNums.length];
		for (int i = 0; i<findNums.length;i++)
		{

			boolean isFound = false;
			for(int j = 0; j<nums.length;j++)
			{
				if(findNums[i] == nums[j]) isFound = true;
				if(isFound && nums[j]>findNums[i])
				{
					result[i] = nums[j];
					break;
				}
				if(j == nums.length-1) result[i] = -1;
			}

		}

		return result;

	}






	public static void main(String[] args)
	{
		int [] nums1 = {2,4};
		int [] nums2 = {1,2,3,4};
		int [] result = nextGreaterElement(nums1,nums2);
		for (Integer x : result)
		{
			System.out.println(x);
		}
	}

}
