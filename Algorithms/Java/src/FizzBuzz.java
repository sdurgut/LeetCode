/**
 * Created by sdurgut on 3/22/17.
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
	public static List<String> fizzBuzz(int n)
	{
		List<String> myList = new ArrayList<String>();

		for(int i = 1; i<=n;i++)
		{
			if (i%3 == 0 && i%5 == 0)
			{
				myList.add("FizzBuzz");
				continue;
			}
			else if (i%3 == 0 )
			{
				myList.add("Fizz");
				continue;
			}
			else if (i%5 == 0 )
			{
				myList.add("Buzz");
				continue;
			}
			else
			{
				myList.add(Integer.toString(i));
			}

		}
		return myList;
	}

	public static void main(String [] args)
	{
		List result = fizzBuzz(15);
		for (Object s : result)
		{
			System.out.println(s);
		}

	}
}
