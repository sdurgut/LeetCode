/**
 * Created by sdurgut on 3/22/17.
 */
import java.util.List;
import java.util.ArrayList;

public class KeyboardRow
{
	public static String[] findWords(String[] words)
	{
		List<String> matchingList = new ArrayList<String>();

		String firstrow = "qwertyuiop";
		String secondrow = "asdfghjkl";
		String thirdrow = "zxcvbnm";


		for (String word : words)
		{
			char[] charArray = word.toLowerCase().toCharArray();
			int wordlength = charArray.length;

			int countForFirstRow = 0;
			int countForSecondRow = 0;
			int countForThirdRow = 0;
			for (Character ch : charArray)
			{

				if (contains(firstrow, ch))
				{
					countForFirstRow++;
				}
				if (contains(secondrow, ch))
				{
					countForSecondRow++;
				}
				if (contains(thirdrow, ch))
				{
					countForThirdRow++;
				}
			}
			if(wordlength == countForFirstRow || wordlength == countForSecondRow || wordlength == countForThirdRow)
				matchingList.add(word);

		}

		String[] matchingArr = matchingList.toArray(new String[matchingList.size()]);

		return matchingArr;



	}


	public static boolean contains(String str, char chr)
	{

		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == chr)
				return true;
		}
		return false;
	}



	public static void main(String[] args)
	{
		String [] test = {"Hello", "Alaska", "Dad", "Peace"};
		String [] result = findWords(test);
		for(int i = 0; i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
