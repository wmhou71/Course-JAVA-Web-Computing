import javax.swing.JOptionPane;

public class BMI1
{
	public static void main(String[] args)
	{
		double BMI = 1.0;
		try
		{
			String firstNum = JOptionPane.showInputDialog("Enter your height(meters):");
			String secondNum = JOptionPane.showInputDialog("Enter your weight(kilograms):");
			double height = Double.parseDouble(firstNum);
			double weight = Double.parseDouble(secondNum);
			BMI = weight/ (height*height);
			JOptionPane.showMessageDialog(null, "The BMI is " + BMI, "BMI", JOptionPane.PLAIN_MESSAGE);
		}
		catch(NumberFormatException e) {             
			System.out.println("Input wring format.");         
		}
	}
}