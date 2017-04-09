/**
 * Created by sdurgut on 4/9/17.
 */

/**
 * Input: "aba", "cdc"
 * Output: 3
 * Explanation: The longest uncommon subsequence is "aba" (or "cdc"),
 * because "aba" is a subsequence of "aba",
 * but not a subsequence of any other strings in the group of two strings.
 * Only letters from a ~ z will appear in input strings.
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/#/description
 */

public class LongestUncommonSubsequence1
{
	public static int findLUSlength(String a, String b)
	{
		/*
		// this solution works fine but the question is expecting to return 3 if a = "aaa", and b = "a". What kind of question is this??
		if(a.equals(b)) return -1;
		if(a.isEmpty()) return b.length();
		if(b.isEmpty()) return a.length();
		String slong,sshort;
		if(a.length() >= b.length() )
		{
			slong = a;
			sshort = b;
		}
		else{
			slong = b;
			sshort = a;
		}
		String [] parts = slong.split(sshort);
		int substringSize = 0;
		for (int i = 0; i<parts.length;i++)
		{
			System.out.println(parts[i]);
			if(parts[i].length() > substringSize) substringSize = parts[i].length();
		}

		return substringSize;
		*/

		// proposed solution, i didn't like it.
		return a.equals(b) ? -1 : Math.max(a.length(), b.length());

	}

	public static void main(String[] args)
	{
//		String a  = "alfagihandalfaskvbadlv";
//		String b = "";
		String a  = "aaa";
		String b = "a";

		System.out.println(findLUSlength(a,b));
	}
}
