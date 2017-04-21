import java.util.*;

/**
 * Created by sdurgut on 4/20/17.
 */
public class MajorityElement
{
	// some custom algorithm
	/*
	static class Tuple<Integer>
	{
		Integer x;
		Integer y;

		public Tuple(Integer x, Integer y)
		{
			this.x = x;
			this.y = y;
		}
		public Integer getFreq()
		{
			return y;
		}
		public Integer getElement()
		{
			return x;
		}
	}

	public static int majorityElement(int[] nums)
	{
		if(nums.length ==1) return nums[0];
		int result = 0;
		List<Tuple> myList = new ArrayList<Tuple>();
		Arrays.sort(nums);
		int current;
		int next;
		int freq = 0;
		for (int i = 0; i<nums.length-1;i++)
		{
			current = nums[i];
			next = nums[i+1];

			if(current==next) freq++;
			else
			{
				Tuple myTuple = new Tuple(current,freq);
				myList.add(myTuple);
				freq = 0;
			}

		}
		for (int i=0; i<myList.size();i++)
		{
			if(  (int) myList.get(i).getFreq() > myList.size()/2  ) return (int) myList.get(i).getElement();
		}

		return -999;
	}
	*/
	// the easiest solution
	/*
	public static int majorityElement(int[] nums)
	{
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	*/

	// the hash map solution

	public static int majorityElement(int[] nums)
	{
		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		int result = 0;
		for(int num: nums)
		{
			if( !myMap.containsKey(num) ) myMap.put(num,1);
			else myMap.put( num, myMap.get(num)+1 );

			if(myMap.get(num) > nums.length/2)
			{
				result = num;
				break;
			}
		}

		return  result;

	}




	public static void main(String [] args)
	{
		int [] arr = {1,2,2,2,5,6,3,2,2,2};
		System.out.println(majorityElement(arr));
	}
}
