import java.util.Scanner;

public class AvgSum
{
	public static void main(String [] args)
	{
		Scanner key = new Scanner(System.in);
		double num1,num2,num3,num4,num5,avg,sum; // User can input decimals because all variables are doubles
		
		System.out.println("\nThis program prompts the user to input 5 numbers,\n" 
			+ "then outputs both the average and the sum of the given numbers."); // explains purpose to user
		
		System.out.println("\nEnter first number:");
		num1 = key.nextDouble();
		System.out.println("Enter second number:");
		num2 = key.nextDouble();
		System.out.println("Enter third number:");
		num3 = key.nextDouble();
		System.out.println("Enter fourth number:");
		num4 = key.nextDouble();
		System.out.println("Enter fifth number:");
		num5 = key.nextDouble();
		
		sum = num1+num2+num3+num4+num5; //adds numbers to calculate sum
		avg = sum/5; //divides numbers by 5 to calculate average

		System.out.println("\nAverage:\n" + avg + "\nSum:\n" + sum); //outputs average and sum
	}
}