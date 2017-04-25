import java.util.Arrays;

/**
 * Created by sdurgut on 4/24/17.
 */
public class ContainsDuplicate
{
	public static boolean containsDuplicate(int[] nums)
	{
		if(nums.length==0) return false;

		Arrays.sort(nums);
		for (int i=0;i<nums.length-1;i++)
		{
			if(nums[i] == nums[i+1]) return true;
		}

		return false;
	}
	public static void main(String [] args)
	{
		int [] arr = {2,3,4,5,6,7,8,9};
		System.out.println(containsDuplicate(arr));


	}
}
