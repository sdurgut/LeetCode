/**
 * Created by sdurgut on 3/26/17.
 */
public class NimGame
{
	public static boolean canWinNim(int n)
	{
		// if the n is the multiple of 4, no matter how you try, you loose the game
		return (n%4 != 0);
	}
	public static void main(String [] args)
	{
		System.out.println(canWinNim(8));
	}
}
