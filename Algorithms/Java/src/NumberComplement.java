/**
 * Created by sdurgut on 3/22/17.
 */
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;

public class NumberComplement
{
	public static int findComplement(int num)
	{
		if(num >= Math.pow(2,31))
		{
			return -999999999;
		}
		List<Integer> myBinary = convertToBinary(num);
		int [] myComplement = complement(myBinary);
		int result = convertToDecimal(myComplement);

		return result;
	}

	public static List<Integer> convertToBinary(int myNum)
	{
		List<Integer> myBinaryList = new ArrayList<Integer>();
		int idx = 0;
		while(myNum>0)
		{
			myBinaryList.add(myNum%2);
			myNum = myNum/2;
		}

		return myBinaryList;
	}

	public static int [] complement(List<Integer> m)
	{
		int [] myComplement = new int [m.size()];
		for (int i = 0; i< m.size(); i++)
		{
			myComplement[i] = 1 - m.get(i);
		}
		return myComplement;
	}
	public static int convertToDecimal(int [] n)
	{
		int result = 0;
		for (int i=0; i<n.length; i++)
		{
			result = result + (int)(n[i]*Math.pow(2,i));
		}
		return result;

	}
	public static void main(String[] args)
	{

		System.out.print(findComplement(5)    );

	}
}
