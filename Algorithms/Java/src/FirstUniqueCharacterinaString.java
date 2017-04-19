import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by sdurgut on 4/19/17.
 */

public class FirstUniqueCharacterinaString
{
	public static int firstUniqChar(String s)
	{
		// my Solution
		/*if(s.length()==0) return -1;
		Stack myStack = new Stack();
		Set<Character> myUniqueSet = new LinkedHashSet<Character>();
		Set<Character> myNonUniqueSet = new LinkedHashSet<Character>();
		char [] myCharArr = s.toCharArray();
		for (int i = 0; i< myCharArr.length; i++)
		{
			if(!myUniqueSet.contains(myCharArr[i])) myUniqueSet.add(myCharArr[i]);
			else myNonUniqueSet.add(myCharArr[i]);
		}
		// for(Character a : myNonUniqueSet) System.out.println(a);
		if(myUniqueSet.equals(myNonUniqueSet)) return -1;
		myUniqueSet.removeAll(myNonUniqueSet);
		char myfirstuniqchar = myUniqueSet.iterator().next();
		for (int i = 0; i< myCharArr.length; i++)
		{
			if(myCharArr[i]==myfirstuniqchar) return i;
		}

		return -1;
		*/

		// much better solution here
		if (s.length() == 0) return -1;
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			freq[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;


	}

	public static void main(String[] args)
	{
		String s = "cc";
		System.out.println(firstUniqChar(s));
	}
}
