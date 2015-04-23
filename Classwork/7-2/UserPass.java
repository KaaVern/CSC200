import java.util.Scanner;

public class UserPass 
{	
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String user = " ";
		String pass = " ";
		
		while(user.compareTo("username")!=0||pass.compareTo("password")!=0)
		{
			System.out.println("\nEnter username:");
			user = keyboard.next();
			System.out.println("Enter password");
			pass = keyboard.next();
		}

		System.out.println("\nWelcome Username!");
		
		keyboard.close();
	}
}
