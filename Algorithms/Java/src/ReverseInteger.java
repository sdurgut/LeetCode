/**
 * Created by sdurgut on 3/22/17.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseInteger
{

	public static int reverse(int myNum)
	{
		List<Integer> numList = new ArrayList<Integer>();
		int posMyNum = Math.abs(myNum);
		while(posMyNum>0)
		{
			// System.out.println(posMyNum);
			numList.add(posMyNum % 10);
			posMyNum = posMyNum/10;
		}

		// System.out.println(Arrays.toString(numList.toArray()));

		int numtoReturn = 0;
		for (int i = 0; i < numList.size(); i++)
		{
			numtoReturn = (int) (numtoReturn + numList.get(i)*Math.pow(10, numList.size()-i-1));
		}
		if (myNum < 0)
		{
			numtoReturn = (-1)*numtoReturn;
		}
		// System.out.println(numtoReturn);
		if (Math.abs(numtoReturn) >= 2147483647) // if the number owerflows 32 bit int return 0
			return 0;
		return numtoReturn;

	}
	public static void main(String[] args)
	{
		System.out.println(reverse(1234));
	}

}
