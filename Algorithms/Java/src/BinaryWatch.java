import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdurgut on 4/24/17.
 */
public class BinaryWatch
{
	public static List<String> readBinaryWatch(int num)
	{
		List<String> myTimeList = new ArrayList<>();
		for (int i = 0; i<12; i++)
		{
			for (int j=0; j<60; j++)
			{
				if( Integer.bitCount(i) + Integer.bitCount(j) == num ) myTimeList.add(String.format("%d:%02d",i,j));
			}
		}

		return myTimeList;

	}

	public static void main(String [] args)
	{
		System.out.println(readBinaryWatch(1));
	}
}
