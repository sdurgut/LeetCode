/**
 * Created by sdurgut on 4/9/17.
 */

/**
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 * Input:[1,2,3]
 * Output:3
 * Explanation: Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1,2,3,4
 * ///////
 * 2,3,4,4
 * 3,4,5,4
 * 4,5,5,5
 * 5,6,6,5
 * 6,7,6,6
 * 7,7,7,7
 *
 * 1,2,3,4,5
 * /////////
 * 2,3,4,5,5
 * 3,4,5,6,5
 * 4,5,6,6,6
 * 5,6,7,7,6
 * 6,7,8,7,7
 * 7,8,8,8,8
 * 8,9,9,9,8
 * 9,10,9,10,9
 * 10,10,10,11,10
 * 11,11,11,11,11
 */
public class MinimumMovestoEqualArrayElements
{
	public static int minMoves(int[] nums)
	{
		/*
		// not that fast solution
		// sum = array sum, m = # of moves, n = array size, x = final array element value
		// sum + m*(n-1) = x*n
		// x = minNum + m
		// sum - minNum*n = m
		int sum = IntStream.of(nums).sum(); // new way of sum with Java8, it looks like this step is damn slow!
		int min = Integer.MAX_VALUE;
		for (int x : nums) {
			if (x < min) {
				min = x;
			}
		}
		return sum - min*nums.length;
		*/

		// better solution, adding n-1 array elements is same as decreasing elements one by one to smallest element
		int min = Integer.MAX_VALUE;
		for (int x : nums)
		{
			if (x < min)
			{
				min = x;
			}
		}
		int count = 0;
		for (int x : nums)
		{
			count += x - min;
		}
		return count;


	}

	public static void main(String[] args)
	{
		int[] test = {1, 2, 3, 4, 5};
		System.out.println(minMoves(test));
	}
}
