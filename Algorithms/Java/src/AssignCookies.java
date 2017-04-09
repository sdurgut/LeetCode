import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by sdurgut on 4/8/17.
 */


/**
 * Input: [1,2,3], [1,1]
 * Output: 1
 * Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
 * And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
 * You need to output 1.
 */

public class AssignCookies
{
	public static int findContentChildren(int[] greedArr, int[] cookieArr)
	{

		/*
		PriorityQueue<Integer> myGreedQueue = new PriorityQueue<>();
		PriorityQueue<Integer> myCookieQueue = new PriorityQueue<>();
		for (int i = 0 ; i<greedArr.length;i++) myGreedQueue.add(greedArr[i]);
		for (int i = 0 ; i<cookieArr.length;i++) myCookieQueue.add(cookieArr[i]);
//		System.out.println(myGreedQueue.peek() + " " + myCookieQueue.peek());
		int cookieCounter = 0;
		while (!myGreedQueue.isEmpty() && !myCookieQueue.isEmpty())
		{
			if(myCookieQueue.peek() >= myGreedQueue.peek())
			{
				myCookieQueue.poll();
				myGreedQueue.poll();
				cookieCounter++;
			}
			else myCookieQueue.poll();
		}

		return cookieCounter;

		*/

		Arrays.sort(greedArr);
		Arrays.sort(cookieArr);
		int i = 0;
		for (int j = 0; i < greedArr.length && j < cookieArr.length; j++)
		{
			if (greedArr[i] <= cookieArr[j]) i++;
		}
		return i;

	}

	public static void main(String[] args)
	{
//		int [] greedArr = {7,8,9,10};
//		int [] cookieArr = {5,6,7,8};
//		int [] greedArr = {1,2,3};
//		int [] cookieArr = {1,1};
		int[] greedArr = {1, 2};
		int[] cookieArr = {1, 2, 3};
		System.out.println(findContentChildren(greedArr, cookieArr));
	}
}
