
/**
 * Created by sdurgut on 3/26/17.
 */

import java.util.Arrays;

public class MaxConsecutiveOnes
{


	public static int findMaxConsecutiveOnes(int[] nums)
	{
		int result = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 1)
			{
				counter++;
				result = Math.max(counter, result);
			} else counter = 0;
		}
		return result;
	}


	public static void main(String[] args)
	{
		int[] array = {1, 1, 0, 0, 1, 0};
		System.out.println(findMaxConsecutiveOnes(array));
	}
}

