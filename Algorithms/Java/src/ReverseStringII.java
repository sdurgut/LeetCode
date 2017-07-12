/**
 * Created by sdurgut on 7/11/17.
 */
public class ReverseStringII
{
	public static String reverseStr(String s, int k)
	{
		// create a char array to modify the string.
		char[] ch=s.toCharArray();

		int i = 0;
		while (i<ch.length)
		{
			int j = Math.min(i+k-1, ch.length-1);
			reverseSubArray(ch,i,j);
			i +=2*k;

		}
		// convert the char array and return
		return String.copyValueOf(ch);

	}

	private static void reverseSubArray(char[] ch, int start, int end)
	{
		while(start<end)
		{
			char tmp = ch[start];
			ch[start++] = ch[end];
			ch[end--] = tmp;
		}

	}

//	public static boolean isEven(int i)
//	{
//		if(i%2 ==0) return true;
//		else return false;
//	}


	public static void main(String [] args)
	{
		String s = "abcdefg";
		System.out.println( reverseStr(s,8) );
	}

}
