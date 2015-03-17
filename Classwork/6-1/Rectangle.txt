import javax.swing.JOptionPane;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		String sWidth = " ", sHeight = " ";
		double width, height, perim, area;
		sWidth = JOptionPane.showInputDialog("Enter the WIDTH of your rectangle:");
		sHeight = JOptionPane.showInputDialog("Enter the HEIGHT of your rectangle:");
		
		width = Double.parseDouble(sWidth);
		height = Double.parseDouble(sHeight);
		
		perim = (2*width) + (2*height);
		area = width*height;
		
		JOptionPane.showMessageDialog(null, "Your rectangle has an area of " + area 
			+ " and a perimeter of " + perim + ".");
		
	}

}
