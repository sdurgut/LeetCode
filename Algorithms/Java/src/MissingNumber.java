import java.util.Arrays;

/**
 * Created by sdurgut on 4/27/17.
 */
public class MissingNumber
{
	public int missingNumber(int[] nums)
	{
		//sum
		int len = nums.length;
		int sum = (0+len)*(len+1)/2;
		for(int i=0; i<len; i++)
			sum-=nums[i];
		return sum;
	}
}
