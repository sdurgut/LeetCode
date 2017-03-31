import java.util.Arrays;

/**
 * Created by sdurgut on 3/31/17.
 */

public class MoveZeroes
{
	public static void moveZeroes(int[] nums)
	{
		if (nums == null || nums.length == 0) return;

		int [] tmp = new int[nums.length]; // all the elements are initialized to zero, java language choice
		int counter = 0;
		for (int i = 0 ; i<nums.length;i++)
		{
			if(nums[i] != 0)
			{
				tmp[counter++] = nums[i];
			}
		}

		for (int i = 0 ; i<tmp.length;i++) nums[i] = tmp[i];




	}

	public static void main(String[] args)
	{
		int [] nums = {0, 1, 0, 3, 12};
		moveZeroes(nums);
		for (int i = 0; i<nums.length;i++)
		{
			System.out.print(nums[i] + " ");
		}

	}


}
