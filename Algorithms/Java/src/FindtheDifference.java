/**
 * Created by sdurgut on 3/29/17.
 */


public class FindtheDifference
{
	public static char findTheDifference(String s, String t)
	{
		char[] array1 = s.toCharArray();
		char[] array2 = t.toCharArray();

		int ascii_s = 0;
		int ascii_t = 0;

		for (int i = 0; i < array1.length; i++)
		{
			ascii_s += (int) array1[i];
		}

		for (int i = 0; i < array2.length; i++)
		{
			ascii_t += (int) array2[i];
		}

		return (char) (ascii_t - ascii_s);


	}

	public static void main(String[] args)
	{
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
}
