/**
 * Created by sdurgut on 3/31/17.
 */
// add two digits without loop or recursion, ex: 2038 = 2+0+3+8 = 1 + 3 = 4
public class AddDigits
{
	public static int addDigits(int num)
	{
		if(num < 9) return num;
		if(num%9 == 0) return 9;
		else return num%9;

	}
	public static void main(String [] args)
	{
		System.out.println(addDigits(2038));

	}

}
