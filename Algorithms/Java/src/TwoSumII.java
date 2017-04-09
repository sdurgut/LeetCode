import java.util.HashMap;
import java.util.Map;

/**
 * Created by sdurgut on 4/8/17.
 */
public class TwoSumII
{
	public static int[] twoSum(int[] numbers, int target)
	{
		/*
		Map<Integer,Integer> myMap = new HashMap<>(); // put number values and indexses to hashmap
		int [] result = new int [2];

		for(int i = 0; i<numbers.length;i++)
		{
			myMap.put(numbers[i],i);
		}

		for (int i = 0; i<numbers.length;i++)
		{
			if(myMap.containsKey(target - numbers[i]) )
			{
				result[0] = i+1;
				result[1] = myMap.get(target - numbers[i]) + 1;
				break;
			}
		}
		return result;
		*/
		// since the given array is sorted this is a faster solution
		int [] result = new int [2];
		int lowIdx = 0, highIdx = numbers.length-1;
		while (numbers[lowIdx]+numbers[highIdx]!=target)
		{
			if (numbers[lowIdx]+numbers[highIdx]<target) lowIdx++;
			else highIdx--;

		}
		result[0] = lowIdx+1;
		result[1] = highIdx + 1;

		return result;

	}

	public static void main(String[] args)
	{
		int [] numbers={2, 7, 11, 15};
		int [] myResult = twoSum(numbers,9);
		System.out.println(myResult[0] + " " + myResult[1]);
	}
}
