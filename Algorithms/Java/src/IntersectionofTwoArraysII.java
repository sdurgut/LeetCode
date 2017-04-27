import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sdurgut on 4/26/17.
 */
public class IntersectionofTwoArraysII
{
	public static int[] intersect(int[] nums1, int[] nums2)
	{
		//if(nums1.length == 0 || nums2.length == 0) return null;
		// int [] intersection = new int[Math.min(nums1.length,nums1.length)];
		List<Integer> intersection = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i=0,j=0;
		while(i<nums1.length && j<nums2.length)
		{
			if(nums1[i]==nums2[j])
			{
				intersection.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i]<nums2[j]) i++;
			else j++;
			// System.out.println(nums1[i] + " " + nums2[j]);
		}

		int [] result = new int[intersection.size()];
		for (int idx = 0; idx<intersection.size();idx++)
		{
			result[idx] = intersection.get(idx);
		}

		return result;
	}

	public static void main(String[] args)
	{
		int [] num1 = {2,3,4,5,667,8,};
		int [] num2 = {1,2,3,4,7,8,10};

		int [] intersection = intersect(num1,num2);
		for(int i = 0; i< intersection.length;i++)
		{
			System.out.print(intersection[i] + " ");
		}
	}
}
