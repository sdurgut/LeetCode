/**
 * Created by sdurgut on 4/21/17.
 */
public class Base7
{
	public static String convertToBase7(int num)
	{
		StringBuilder sb = new StringBuilder();

		boolean isNegative = num < 0;
		num = Math.abs(num);
		int remainder = 0;
		while(num > 6)
		{
			remainder = num%7;
			num = num/7;
			sb.append(remainder);
		}
		sb.append(num);
		String tmp = sb.reverse().toString();
		StringBuilder result = new StringBuilder();

		if (isNegative)
		{
			result.append("-");
			result.append(tmp);
			return result.toString();
		}
		else return tmp;
	}

	public static void main(String [] args)
	{
		System.out.println(convertToBase7(0));
	}
}
