/**
 * Created by sdurgut on 4/24/17.
 */
public class LongestPalindrome
{

	public static int longestPalindrome(String s)
	{
		if(s == "" || s.isEmpty()) return 0;

		int [] freqArray = new int['z'-'A' +1]; // initialized with 0's.

		boolean allElementsAreSame = true;
		for (int i = 0; i<s.length();i++)
		{
			if (i<s.length()-1 && s.charAt(i) != s.charAt(i+1)) allElementsAreSame = false;
			freqArray[s.charAt(i) - 'A']++;
		}
		if(allElementsAreSame) return s.length();



		int maxLength = 0;
		boolean singleUsed = false;
		boolean existsOne = false;
		boolean isOdd = false;
		for (int i=0; i<freqArray.length;i++)
		{
			// System.out.println(freqArray[i] + " " + (char)(i+ 'A'));
			if(freqArray[i]==1 && singleUsed==false)
			{

				maxLength++;
				// System.out.println(freqArray[i] + " " + (char)(i+ 'A') + " " + maxLength);
				singleUsed = true;
				existsOne = true;
			}
			if(freqArray[i]>1) maxLength += 2*(freqArray[i]/2);
			if(freqArray[i]%2 !=0 )
			{
				isOdd=true;
				// System.out.print((char)(i+ 'A'));
			}

		}
		// System.out.println(isOdd);
		if(isOdd == false) return s.length();

		if (existsOne==false) maxLength ++;

		return maxLength;
	}


	public static void main(String [] args)
	{
		String s = "tattarrattat";
		System.out.println(  longestPalindrome(s));
	}
}
