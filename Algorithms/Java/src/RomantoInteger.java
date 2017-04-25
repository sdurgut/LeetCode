import java.util.HashMap;
import java.util.Map;

/**
 * Created by sdurgut on 4/24/17.
 */
public class RomantoInteger
{
	public static int romanToInt(String s)
	{
		Map<Character,Integer> myMap = new HashMap<Character,Integer>();
		myMap.put('I', 1);
		myMap.put('V', 5);
		myMap.put('X', 10);
		myMap.put('L', 50);
		myMap.put('C', 100);
		myMap.put('D', 500);
		myMap.put('M', 1000);

		int sum = 0;
		char [] myCharArr = s.toCharArray();
		for (int i = 0; i<myCharArr.length-1;i++)
		{
			if( myMap.get(myCharArr[i]) < myMap.get(myCharArr[i+1]) ) sum -= myMap.get(myCharArr[i]);
			else sum += myMap.get(myCharArr[i]);
		}

		sum += myMap.get(myCharArr[myCharArr.length-1]);


		return sum;

	}

	public static void main(String[] args)
	{
		String s = "MDCXCV";
		System.out.println(romanToInt(s));

	}
}
