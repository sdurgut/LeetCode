/**
 * Created by sdurgut on 3/22/17.
 */
public class ReverseString
{
	public static String reverseString(String s)
	{
		char [] myCharArr = s.toCharArray();
		char [] myReverseArr = new char[myCharArr.length];
		for (int i = 0; i< myCharArr.length;i++)
		{
			myReverseArr[i] = myCharArr[myCharArr.length-i-1];
		}
		String result = String.copyValueOf(myReverseArr);
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(reverseString("hello"));
	}
}
