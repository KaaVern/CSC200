
import java.util.Scanner;

public class SumAverage
{
	public static void main(String [] args) 
	{
		double numA, numB, numC, numD, numE, sum, avg;
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("\nInput five numbers, then this program will display the sum "
			+ "and average of those numbers.");
		
		System.out.println("\nPlease enter your first number:");
		numA = keyboard.nextDouble();
		System.out.println("Please enter your second number:");
		numB = keyboard.nextDouble();
		System.out.println("Please enter your third number:");
		numC = keyboard.nextDouble();
		System.out.println("Please enter your fourth number:");
		numD = keyboard.nextDouble();
		System.out.println("Please enter your fifth number:");
		numE = keyboard.nextDouble();
		
		sum = numA+numB+numC+numD+numE;
		avg = sum/5;
		
		System.out.println("\nThe sum of the numbers is " + sum + ", and the average of the "
			+ "numbers is " + avg + ".");
	}
}



