/**
 * Created by sdurgut on 3/29/17.
 */
public class DetectCapitalUse
{
	public static boolean detectCapitalUse(String word)
	{
		boolean firstCharisCap = false;
		if(Character.isUpperCase(word.charAt(0))) firstCharisCap = true;

		int capitalCharCounter = 0;
		for(int i = 1; i< word.length();i++)
		{
			if(Character.isUpperCase(word.charAt(i))) capitalCharCounter++;
		}
		if(capitalCharCounter == 0) return true;
		else
		{
			if(firstCharisCap == false) return false;
			if(firstCharisCap == true)
			{
				if(capitalCharCounter != word.length()-1) return false;
				else return true;
			}
		}
		return false;

	}

	public static void main(String[] args)
	{
		String myString = "goG";
		System.out.println(detectCapitalUse(myString));
	}
}
