/**
 * Created by sdurgut on 4/14/17.
 */
public class RansomNote
{
	public static boolean canConstruct(String ransomNote, String magazine)
	{
		int [] freqofLetters = new int[26];

		for (char myChar: magazine.toCharArray())
		{
			freqofLetters[myChar - 'a']++;
		}

		for (char c: ransomNote.toCharArray())
		{
			freqofLetters[c-'a']--;
			if(freqofLetters[c-'a'] < 0) return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		String magazine = "ananiavradini";
		String ransomNote = "ani";
		System.out.println(canConstruct(ransomNote,magazine));
	}
}
