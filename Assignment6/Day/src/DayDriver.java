
public class DayDriver
{
	public static void main(String [] args)
	{
		
		Day day1 = new Day();
		Day day2 = new Day();
		Day day3 = new Day();
		Day day4 = new Day();
		Day day5 = new Day();
		Day day6 = new Day();
		Day day7 = new Day();
		Day day8 = new Day("Sunday");
		
		day1.setDay("Sunday");
		
		day1.printDay();
		System.out.println("Today is " + day1.getDay());
		System.out.println("In 40 days, it will be " + day1.findWeekday(40));
		System.out.println("Tomorrow is " + day1.getTomorrow());
		System.out.println("Yesterday was " + day1.getYesterday());
		System.out.println("\n");
		
		day2.setDay("Monday");
		
		day2.printDay();
		System.out.println("Today is " + day2.getDay());
		System.out.println("In 40 days, it will be " + day2.findWeekday(40));
		System.out.println("Tomorrow is " + day2.getTomorrow());
		System.out.println("Yesterday was " + day2.getYesterday());
		System.out.println("\n");
		
		day3.setDay("Tuesday");
		
		day3.printDay();
		System.out.println("Today is " + day3.getDay());
		System.out.println("In 40 days, it will be " + day3.findWeekday(40));
		System.out.println("Tomorrow is " + day3.getTomorrow());
		System.out.println("Yesterday was " + day3.getYesterday());
		System.out.println("\n");
		
		day4.setDay("Wednesday");
		
		day4.printDay();
		System.out.println("Today is " + day4.getDay());
		System.out.println("In 40 days, it will be " + day4.findWeekday(40));
		System.out.println("Tomorrow is " + day4.getTomorrow());
		System.out.println("Yesterday was " + day4.getYesterday());
		System.out.println("\n");
		
		day5.setDay("Thursday");
		
		day5.printDay();
		System.out.println("Today is " + day5.getDay());
		System.out.println("In 40 days, it will be " + day5.findWeekday(40));
		System.out.println("Tomorrow is " + day5.getTomorrow());
		System.out.println("Yesterday was " + day5.getYesterday());
		System.out.println("\n");
		
		day6.setDay("Friday");
		
		day6.printDay();
		System.out.println("Today is " + day6.getDay());
		System.out.println("In 40 days, it will be " + day6.findWeekday(40));
		System.out.println("Tomorrow is " + day6.getTomorrow());
		System.out.println("Yesterday was " + day6.getYesterday());
		System.out.println("\n");
		
		day7.setDay("Saturday");
		
		day7.printDay();
		System.out.println("Today is " + day7.getDay());
		System.out.println("In 40 days, it will be " + day7.findWeekday(40));
		System.out.println("Tomorrow is " + day7.getTomorrow());
		System.out.println("Yesterday was " + day7.getYesterday());
		System.out.println("\n");
		
		day8.printDay();
		System.out.println("Today is " + day8.getDay());
		System.out.println("In 40 days, it will be " + day8.findWeekday(40));
		System.out.println("Tomorrow is " + day8.getTomorrow());
		System.out.println("Yesterday was " + day8.getYesterday());
	}
}
