import java.util.Scanner;

public class Part2
{
	public static void main(String [] args)
	{
		double x,y,z;
		
		System.out.print("\n");
		
		x = input();
		y = input();
		z = input();
		
		System.out.print("\n");
		
		output(pow1(x));
		output(add(x,y));
		output(stuff(x,y,z));
	}
	
	public static double pow1(double x)
	{
		return Math.pow(x,10);
	}
	
	public static double add(double x, double y)
	{
		return x+y;
	}
	
	public static double stuff(double x, double y, double z)
	{
		return Math.sqrt(x) + Math.abs(y) + Math.pow(z,y);
	}
	
	public static double input()
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number");
		return key.nextDouble();
	}
	
	public static void output(double x)
	{
		System.out.println(x);
	}
}
