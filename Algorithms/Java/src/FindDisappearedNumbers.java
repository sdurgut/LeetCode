/**
 * Created by sdurgut on 3/26/17.
 */

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers
{
	public static List<Integer> findDisappearedNumbers(int[] nums)
	{
		List<Integer> ret = new ArrayList<>();

		for (int i = 0; i < nums.length; i++)
		{
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0)
			{
				nums[val] = -nums[val];
				System.out.println(nums[val]);
			}
		}

		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] > 0)
			{
				ret.add(i + 1);
			}
		}
		return ret;


	}

	public static void main(String[] args)
	{
		int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> result = findDisappearedNumbers(array);
		for (Integer i : result)
		{
			System.out.println(i);
		}
	}
}
