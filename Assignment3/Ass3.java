import javax.swing.JOptionPane;

public class Ass3 
{
	public static void main(String [] args)
	{
		String inUser, inPass, UAdmin = "Admin", PAdmin = "AdPass";
		String UStudent = "Student", PStudent = "StuPass", UStaff = "Staff", PStaff = "StaPass";
		int u = 0, p = 0;
		boolean blUser=false, blPass=false;
		
		JOptionPane.showMessageDialog(null, "Because this is only a demonstration program, the correct usernames and passwords will be given to you as you are prompted to enter them.");
		
		String[] choices = { "Admin", "Student", "Staff"};
		String Account = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
		
		if (Account.equals("Admin"))
		{
			while(blUser==false&u<3)
			{
				inUser = JOptionPane.showInputDialog("ENTER USERNAME (it's Admin):");
				blUser = inUser.equals(UAdmin);
				if(blUser==false)
				{
					u++;
				}
			}

			if(blUser)
			{
				while(blPass==false&p<3)
				{
					inPass = JOptionPane.showInputDialog("ENTER PASSWORD (it's AdPass):");
					blPass = inPass.equals(PAdmin);
					if(blPass==false)
					{
						p++;
					}
				}
			
				if(p==3)
				{
					JOptionPane.showMessageDialog(null, "Contact Administrator.");
				}
			
				if(blPass)
				{
					JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read files.");
				}
			}

			if(u==3) 
			{
				JOptionPane.showMessageDialog(null, "Invalid Username.");
			}
		}
		
		if (Account.equals("Student")) 
		{
			while(blUser==false&u<3)
			{
				inUser = JOptionPane.showInputDialog("ENTER USERNAME (it's Student):");
				blUser = inUser.equals(UStudent);
				if(blUser==false)
				{
					u++;
				}
			}

			if(blUser)
			{
				while(blPass==false&p<3)
				{
					inPass = JOptionPane.showInputDialog("ENTER PASSWORD (it's StuPass):");
					blPass = inPass.equals(PStudent);
					if(blPass==false)
					{
						p++;
					}
				}
			
				if(p==3)
				{
					JOptionPane.showMessageDialog(null, "Contact Administrator.");
				}
			
				if(blPass)
				{
					JOptionPane.showMessageDialog(null, "Welcome Student! You can only read files.");
				}
			}

			if(u==3) 
			{
				JOptionPane.showMessageDialog(null, "Invalid Username.");
			}
		}
		
		if (Account.equals("Staff")) 
		{
			while(blUser==false&u<3)
			{
				inUser = JOptionPane.showInputDialog("ENTER USERNAME (it's Staff):");
				blUser = inUser.equals(UStaff);
				if(blUser==false)
				{
					u++;
				}
			}

			if(blUser)
			{
				while(blPass==false&p<3)
				{
					inPass = JOptionPane.showInputDialog("ENTER PASSWORD (it's StaPass):");
					blPass = inPass.equals(PStaff);
					if(blPass==false)
					{
						p++;
					}
				}
			
				if(p==3)
				{
					JOptionPane.showMessageDialog(null, "Contact Administrator.");
				}
			
				if(blPass)
				{
					JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, and delete files.");
				}
			}

			if(u==3) 
			{
				JOptionPane.showMessageDialog(null, "Invalid Username.");
			}
		}
	}
}