/**
 * Created by sdurgut on 7/11/17.
 */

import java.util.Arrays;

public class MaximumProductofThreeNumbers
{
	public static int maximumProduct(int[] nums)
	{

		Arrays.sort(nums);
		int product1, product2;
		product1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]; // [-1,1,2,3]
		product2 = nums[nums.length - 1] * nums[0] * nums[1]; // [-3-2,0,1,4]
		return Math.max(product1,product2);

	}

	public static void main(String[] args)
	{
		int [] nums = {1,2,3,4};

		System.out.println(maximumProduct(nums));
	}


}
