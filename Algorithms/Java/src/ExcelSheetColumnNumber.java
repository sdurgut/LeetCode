/**
 * Created by sdurgut on 4/20/17.
 */
public class ExcelSheetColumnNumber
{
	public static int titleToNumber(String s)
	{
		char [] charArr = s.toCharArray();
		int result = 0;
		for (int i = charArr.length -1 ; i>=0;i--)
		{
			result += (charArr[i] - 'A' +1)*Math.pow(26,charArr.length-i-1);
			// System.out.println(charArr[i] + " " + (charArr[i] - 'A' +1)*Math.pow(26,charArr.length-i-1));
		}

		return result;
	}

	public static void main(String [] args)
	{
		String s = "BA";
		System.out.println(titleToNumber(s));
	}
}
