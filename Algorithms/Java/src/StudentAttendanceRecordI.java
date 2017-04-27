/**
 * Created by sdurgut on 4/26/17.
 */
public class StudentAttendanceRecordI
{
	public static boolean checkRecord(String s)
	{
		if(s.contains("LLL")) return false;
		char [] arr = s.toCharArray();
		int absentCount = 0;
		for (char a : arr)
		{
			if(a=='A') absentCount++;
		}
		if(absentCount>1) return false;

		return true;
	}
	public static void main(String [] args)
	{
		String s = "LALLL";

		System.out.println(checkRecord(s));
	}
}
