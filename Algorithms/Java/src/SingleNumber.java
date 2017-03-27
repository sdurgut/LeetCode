import java.util.Arrays;

/**
 * Created by sdurgut on 3/26/17.
 */
public class SingleNumber
{
	public static int singleNumber(int[] nums)
	{
		// xor solution
		int result = 0;
		for (int i = 0; i<nums.length;i++)
		{
			result ^= nums[i];
		}

		return result;

		/*
		// brute force solution
		Arrays.sort(nums);
		if(nums.length<3)
			return nums[0];

		for(int i = 0 ; i< nums.length; i++)
		{
			if(i==0)
			{
				if (nums[i] != nums[i+1] && nums[i+1] == nums[i+2]) return nums[i];
			}
			if (  i>0 && i< nums.length-2 && nums[i-1] != nums[i] && nums[i] != nums[i+1] )
			{
				// System.out.println(nums[i]);
				return nums[i];
			}

			if(i==nums.length-1)
			{
				if (nums[i] != nums[i-1] && nums[i-1] == nums[i-2]) return nums[i];
			}
		}
		return -999999;
		*/
	}

	public static void main(String[] args)
	{
		int [] array = {9,9,1,1,3,4,4,6,6};
		// int [] array = {2,2,1,1,3};
		 System.out.println(singleNumber(array));
	}
}
