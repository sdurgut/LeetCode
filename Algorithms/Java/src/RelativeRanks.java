import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sdurgut on 4/7/17.
 */


/**
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 */

public class RelativeRanks
{
	public String[] findRelativeRanks(int[] nums)
	{
		// create a hashmap as keys = # of medals, values = indexes
		Map<Integer,Integer> myMap = new HashMap<>();
		for (int i = 0; i<nums.length;i++)
		{
			myMap.put(nums[i],i);
		}

//		System.out.println(myMap.toString());
		Arrays.sort(nums); // new array is 14,15,18,19,20
//		System.out.println(nums[0]);
		String [] strArr = new String[nums.length];

		if(nums.length-1>=0) strArr[ myMap.get(nums[nums.length-1]) ] = "Gold Medal";
		if (nums.length-1>=1) strArr[ myMap.get(nums[nums.length-2]) ] = "Silver Medal";
		if (nums.length-1>=2) strArr[ myMap.get(nums[nums.length-3]) ] = "Bronze Medal";
		for(int i = nums.length-4; i>=0;i--)
		{

			strArr[ myMap.get(nums[i]) ] = Integer.toString(nums.length-i);
		}


		return strArr;

	}

	public static void main(String [] args)
	{
		RelativeRanks relativeRanks = new RelativeRanks();
		int [] intArr = {20,19,18,15,14};


		String [] test = relativeRanks.findRelativeRanks(intArr);
		for (int i = 0;i<test.length;i++)
		{
			System.out.print(test[i] + " ");
		}


	}
}
