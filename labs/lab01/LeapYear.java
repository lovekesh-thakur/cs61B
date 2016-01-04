public class LeapYear
{
	public static void main(String[] args)
	{
		int year = Integer.parseInt(args[0]);
		System.out.println(year + " is a Leap year : " + isLeapYear(year));
	}
	
    /* Returns True if YEAR is a Leap Year, else False */
	private static boolean isLeapYear(int year)
	{
		if(year < 0)
			return false;

		if(year%100 != 0) 
		{
			if(year%4 == 0)
				return true;
			else
				return false;
        }
        else 
        {
        	if(year % 400 == 0)
        		return true;
        	else
        		return false;
        }

	}
}