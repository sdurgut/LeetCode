/**
 * Created by sdurgut on 3/22/17.
 */
public class HammingDistance
{
	public static int hammingDistance(int x, int y)
	{
		if ( x >= Math.pow(2,31)|| y >= Math.pow(2,31) )
		{
			return -1;
		}
		int [] binaryX = convertToBinary(x);
		int [] binaryY = convertToBinary(y);

		int distance = 0;
		for(int i = 0; i<binaryX.length; i++)
		{
			if (binaryX[i] != binaryY[i])
			{
				distance++;
			}
		}
		return distance;
	}
	public static int [] convertToBinary(int myNum)
	{
		int [] binary = new int[32];
		int idx = 0;
		while(myNum>0)
		{
			binary[idx++] = myNum%2;
			myNum = myNum/2;
		}
		return binary;
	}

	public static void main(String [] args)
	{
		System.out.println(hammingDistance(5,6));
	}

}
