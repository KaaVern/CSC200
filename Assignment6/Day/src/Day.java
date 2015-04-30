
public class Day 
{
	int numToday, numYesterday, numTomorrow;
	String today, yesterday, tomorrow; 
	String sun = "Sunday";
	String mon = "Monday";
	String tue = "Tuesday";
	String wed = "Wednesday";
	String thu = "Thursday";
	String fri = "Friday";
	String sat = "Saturday";
	
	/**
	 * Used to tell which day is today, tomorrow, yesterday, 
	 * and to determine what day of the week it will be 
	 * in a given number of days.
	 */
	public Day()
	{
		today = sun;
		setTodayNum();
		setOtherDays();
	}
	
	/**
	 * Used to tell which day is today, tomorrow, yesterday, 
	 * and to determine what day of the week it will be 
	 * in a given number of days.
	 * 
	 * Simple constructor. Enter the day of the week.
	 * 
	 * @param today
	 */
	public Day(String today)
	{
		this.today = today;
		setTodayNum();
		setOtherDays();
	}
	
	/**
	 * Returns the current day of the week
	 * 
	 * @return
	 */
	public String getDay()
	{
		return today;
	}
	
	/**
	 * Prints the current day in the console
	 */
	public void printDay()
	{
		System.out.println("The current day is " + today);
	}
	
	/**
	 * Sets the current day of the week
	 * 
	 * @param today
	 */
	public void setDay(String today)
	{
		this.today = today;
		setTodayNum();
		setOtherDays();
	}
	
	/**
	 * Returns the day of the week after the current day
	 * 
	 * @return
	 */
	public String getTomorrow()
	{
		return tomorrow;
	}
	
	/**
	 * Returns the day of the week before the current day
	 * 
	 * @return
	 */
	public String getYesterday()
	{
		return yesterday;
	}
	
	/**
	 * If you want to find out what day of the week it will be
	 * a specific number of days from now, then this is the method for you!
	 * 
	 * Enter the number of days from now, and day of the week of that day is returned.
	 * 
	 * @param days
	 * @return
	 */
	public String findWeekday(int days)
	{
		int x;
		days = numToday+days;
		x = days%7;
		if(x>(-1) || x<7)
		{
			if(x == 0)
			{
				return sun;
			}
			if(x == 1)
			{
				return mon;
			}
			if(x == 2)
			{
				return tue;
			}
			if(x == 3)
			{
				return wed;
			}
			if(x == 4)
			{
				return thu;
			}
			if(x == 5)
			{
				return fri;
			}
			if(x == 6)
			{
				return sat;
			}
			else 
			{
				return ""; 
			}
		}
		else 
		{
			return "Something went wrong.";
		}
	}
	
	//Sets the current day's number based on the text
	private void setTodayNum()
	{
		if(today.compareToIgnoreCase(sun) == 0)
		{
			numToday = 0;
		}
		if(today.compareToIgnoreCase(mon) == 0)
		{
			numToday = 1;
		}
		if(today.compareToIgnoreCase(tue) == 0)
		{
			numToday = 2;
		}
		if(today.compareToIgnoreCase(wed) == 0)
		{
			numToday = 3;
		}
		if(today.compareToIgnoreCase(thu) == 0)
		{
			numToday = 4;
		}
		if(today.compareToIgnoreCase(fri) == 0)
		{
			numToday = 5;
		}
		if(today.compareToIgnoreCase(sat) == 0)
		{
			numToday = 6;
		}
	}
	
	//sets the number and text of "yesterday" and "tomorrow" based on today
	private void setOtherDays()
	{
		numYesterday = numToday-1;
		numTomorrow = numToday+1;
		
		if(numYesterday<0)
		{
			numYesterday = numYesterday + 7;
		}
		if(numTomorrow>6)
		{
			numTomorrow = numTomorrow - 7;
		}
		
		if(numYesterday == 0) 
		{
			yesterday = sun;
		}
		if(numYesterday == 1) 
		{
			yesterday = mon;
		}
		if(numYesterday == 2) 
		{
			yesterday = tue;
		}
		if(numYesterday == 3) 
		{
			yesterday = wed;
		}
		if(numYesterday == 4) 
		{
			yesterday = thu;
		}
		if(numYesterday == 5) 
		{
			yesterday = fri;
		}
		if(numYesterday == 6) 
		{
			yesterday = sat;
		}
		
		if(numTomorrow == 0) 
		{
			tomorrow = sun;
		}
		if(numTomorrow == 1) 
		{
			tomorrow = mon;
		}
		if(numTomorrow == 2) 
		{
			tomorrow = tue;
		}
		if(numTomorrow == 3) 
		{
			tomorrow = wed;
		}
		if(numTomorrow == 4) 
		{
			tomorrow = thu;
		}
		if(numTomorrow == 5) 
		{
			tomorrow = fri;
		}
		if(numTomorrow == 6) 
		{
			tomorrow = sat;
		}
	}
}
