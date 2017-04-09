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
		// brute force
		Arrays.sort(nums);
		
	}

	public static void main(String[] args)
	{

	}
}
