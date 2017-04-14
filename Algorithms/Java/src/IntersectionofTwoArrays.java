import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sdurgut on 4/14/17.
 */
public class IntersectionofTwoArrays
{
	public static int[] intersection(int[] nums1, int[] nums2)
	{
		Set<Integer> mySet1 = new HashSet<Integer>();
		Set<Integer> mySet2 = new HashSet<Integer>();
		for (int i = 0; i< nums1.length;i++)
		{
			mySet1.add(nums1[i]);
		}
		for (int i = 0; i< nums2.length; i++)
		{
			if(mySet1.contains(nums2[i]))
			{
				mySet2.add(nums2[i]);
			}
		}

		int i = 0;
		int [] intArray = new int[mySet2.size()];
		for (Integer a : mySet2)
		{
			intArray[i++] = a;
		}


		return intArray;
	}

	public static void main(String [] args)
	{
		int [] test1 = {1, 2, 2, 1,20,12};
		int [] test2 = {2, 2,3,4,5,100};
		int [] myIntersection = intersection(test1,test2);
		System.out.println(myIntersection.length);

	}
}
