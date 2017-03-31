/**
 * Created by sdurgut on 3/31/17.
 */
public class ConstructRectangle
{
	public static int[] constructRectangle(int area)
	{
		int [] answer = {0,0};
		if(area ==0 ) return answer;

		int lwDistance = (int) Math.pow(2,31);
		for(int width = 1; width<=Math.sqrt(area); width++) // width<=length so width should be smaller than sqrt(area)
		{
			// System.out.println(width);
			int length = area/width;
			if(length*width != area) continue;
			if(length-width < lwDistance)
			{
				lwDistance = length-width;
				answer[0] = length;
				answer[1] = width;
			}
		}

		return answer;
	}

	public static void main(String[] args)
	{
		int result [] = constructRectangle(20);
		System.out.println(result[0]+" "+result[1]);
	}
}
