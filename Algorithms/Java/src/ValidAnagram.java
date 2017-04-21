/**
 * Created by sdurgut on 4/21/17.
 */
public class ValidAnagram
{
	public static boolean isAnagram(String s, String t)
	{
		if (s.length() != t.length()) return false;

		int [] freq = new int[26];
		char [] sArr = s.toCharArray();
		char [] tArr = t.toCharArray();
		for (int i=0; i<sArr.length;i++)
		{
			freq[sArr[i]-'a']++;
		}

		for (int i=0; i<tArr.length;i++)
		{
			freq[tArr[i]-'a']--;
		}

		for (int i=0; i<freq.length;i++ )
		{
			if(freq[i] != 0) return false;
		}

		return true;

	}
	public static void main(String [] args)
	{
		String s = "anagram";
		String t =  "nagaram";
		System.out.println(isAnagram(s,t));

	}

}
