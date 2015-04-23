import java.util.Scanner;

public class UserPassLimit
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String user = " ";
		String pass = " ";
		int x = 0;
		
		for(x = 0; x<3 && (user.compareTo("username")!=0 || pass.compareTo("password")!=0); x++)
		{
			System.out.println("\nEnter username:");
			user = keyboard.next();
			System.out.println("Enter password:");
			pass = keyboard.next();
		}
		
		if(x==3&&(user.compareTo("username")!=0 || pass.compareTo("password")!=0))
		{
			System.out.println("\nPlease contact your administrator to unlock your account");
		}

		else
		{
			System.out.println("\nWelcome username!");
		}
		
		keyboard.close();
	}
}
