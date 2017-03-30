/**
 * Created by sdurgut on 3/29/17.
 */

// sum two integers without +,-, bit manipulation
public class SumofTwoIntegers
{
	public static int getSum(int a, int b)
	{
		// Iterate till there is no carry
		while (b != 0)
		{
			// carry now contains common set bits of x and y
			int carry = a & b;

			// Sum of bits of x and y where at least one of the bits is not set
			a = a ^ b;

			// Carry is shifted by one so that adding it to x gives the required sum
			b = carry << 1;
		}
		return a;


		/********************************************
		 * lets add
		 * 0110 = 6
		 * 0101 = 5
		 * we can represent the result as: 0011 + 1000(carry is 1000 here then bit shift carry)
		 * 1011 + 0000, b becomes 0 so the result is 1011 = 8+2+1 = 11
		 * for more info: http://sys.cs.rice.edu/course/comp314/10/p2/javabits.html
		 *********************************************/
	}
	public static void main(String [] args)
	{

		System.out.println(getSum(4,4));
	}
}
