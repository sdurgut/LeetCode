import java.util.HashMap;
import java.util.Map;

/**
 * Created by sdurgut on 4/27/17.
 */
public class NumberofBoomerangs
{
	public static int numberOfBoomerangs(int[][] points)
	{
		int result = 0;
		Map<Double, Integer> myMap = new HashMap<>();
		for(int i=0; i<points.length;i++)
		{
			for (int j = 0; j<points.length;j++)
			{
				if(i != j)
				{
					double d = getDistance(points[i],points[j]);
					myMap.put(d,myMap.getOrDefault(d,0)+1 );
				}
			}
			for(int val : myMap.values())
			{
				result += val*(val-1);
			}

			myMap.clear();
		}


		return result;
	}

	public static double getDistance(int [] p1, int [] p2)
	{
		return Math.sqrt( Math.pow(p1[0]-p2[0],2) + Math.pow(p1[1]-p2[1],2) );
	}

	public static void main(String[] args)
	{
		int [][] points = {{0,0},{0,1},{1,0}};

		System.out.println(numberOfBoomerangs(points));
	}
}
