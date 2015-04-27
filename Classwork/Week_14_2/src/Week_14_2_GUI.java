import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Week_14_2_GUI implements ActionListener
{
	public static int [] sortedList(int [] numberList)
	{
		for(int i=1; i<numberList.length; i++)
		{
			for(int j=0; j<numberList.length; j++)
			{
				if(numberList[i]<numberList[j])
				{
					swap(numberList,i,j);
				}
			}
		}
		
		return numberList;
	}
	
	private static void swap(int [] numberList, int i, int j)
	{
		int temp = numberList[i];
		numberList[i] = numberList[j];
		numberList[j] = temp;
	}
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output1, output2, output3, output4, output5, output6, 
	output7, output8, output9, output10;
	private JTextField textField1, textField2, textField3, textField4, 
	textField5, textField6, textField7, textField8, textField9, textField10;
	private JButton button;
	
	public Week_14_2_GUI()
	{
		frame = new JFrame("Number Sorter");
		frame.setVisible(true);
		frame.setSize(740,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		label = new JLabel();
		label.setText("Enter 10 numbers in any order:");
		
		output1 = new JLabel();
		output2 = new JLabel();
		output3 = new JLabel();
		output4 = new JLabel();
		output5 = new JLabel();
		output6 = new JLabel();
		output7 = new JLabel();
		output8 = new JLabel();
		output9 = new JLabel();
		output10 = new JLabel();
		
		textField1 = new JTextField(3);
		textField2 = new JTextField(3);
		textField3 = new JTextField(3);
		textField4 = new JTextField(3);
		textField5 = new JTextField(3);
		textField6 = new JTextField(3);
		textField7 = new JTextField(3);
		textField8 = new JTextField(3);
		textField9 = new JTextField(3);
		textField10 = new JTextField(3);
		
		button = new JButton("Sort Numbers");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(textField4);
		panel.add(textField5);
		panel.add(textField6);
		panel.add(textField7);
		panel.add(textField8);
		panel.add(textField9);
		panel.add(textField10);
		panel.add(button);
		panel.add(output1);
		panel.add(output2);
		panel.add(output3);
		panel.add(output4);
		panel.add(output5);
		panel.add(output6);
		panel.add(output7);
		panel.add(output8);
		panel.add(output9);
		panel.add(output10);
		
		frame.add(panel);
	}
	
	public void actionPerformed(ActionEvent e) 
	{	
		int [] unsortedList = {0,0,0,0,0,0,0,0,0,0};
		unsortedList [0] = (int)Double.parseDouble(textField1.getText());
		unsortedList [1] = (int)Double.parseDouble(textField2.getText());
		unsortedList [2] = (int)Double.parseDouble(textField3.getText());
		unsortedList [3] = (int)Double.parseDouble(textField4.getText());
		unsortedList [4] = (int)Double.parseDouble(textField5.getText());
		unsortedList [5] = (int)Double.parseDouble(textField6.getText());
		unsortedList [6] = (int)Double.parseDouble(textField7.getText());
		unsortedList [7] = (int)Double.parseDouble(textField8.getText());
		unsortedList [8] = (int)Double.parseDouble(textField9.getText());
		unsortedList [9] = (int)Double.parseDouble(textField10.getText());
		
		int [] sortedList = sortedList(unsortedList);
		
		output1.setText(String.valueOf(sortedList [0]));
		output2.setText(String.valueOf(sortedList [1]));
		output3.setText(String.valueOf(sortedList [2]));
		output4.setText(String.valueOf(sortedList [3]));
		output5.setText(String.valueOf(sortedList [4]));
		output6.setText(String.valueOf(sortedList [5]));
		output7.setText(String.valueOf(sortedList [6]));
		output8.setText(String.valueOf(sortedList [7]));
		output9.setText(String.valueOf(sortedList [8]));
		output10.setText(String.valueOf(sortedList [9]));
		
	}
}
