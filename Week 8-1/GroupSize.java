import javax.swing.JOptionPane;

public class GroupSize 
{
	public static void main(String [] args) 
	{
		String strPeople, strPlayers;
		int numPeople, numPlayers, teamSize, groupSize = 0;
		boolean tooMany = true;
		
		strPeople = JOptionPane.showInputDialog("How many people are in your group?");
		strPlayers = JOptionPane.showInputDialog("How many total players are there?");
		numPeople = Integer.parseInt(strPeople);
		numPlayers = Integer.parseInt(strPlayers);
		
		boolean blPeople3 = numPeople>10;
		boolean blPeople10 = numPeople>=3 & numPeople<=10;
		boolean tooFew = numPeople<3;
		boolean blPlayers = numPlayers>=11 & numPlayers<=55;
		
		if (blPeople3) { 
			groupSize = numPeople/2; 
		} 
		if (blPeople10) { 
			groupSize = numPeople/3; 
		}
		if (tooFew)
		 {
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
			tooMany = false;
		}
		if (tooMany) {
			if (blPlayers) { 
				teamSize = numPlayers/11; 
				} 
			else { 
				teamSize = 1; 
		} 
		JOptionPane.showMessageDialog(null, "People: " + numPeople + ". Group size: "
				+ groupSize + ". Players: " + numPlayers + ". Team size: " + teamSize + "."); 
		}
	}
}