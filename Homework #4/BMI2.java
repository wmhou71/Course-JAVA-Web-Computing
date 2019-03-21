import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BMI2 extends JFrame
{
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	
	public BMI2()
	{
		super("BMI");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Enter your height(meters)");
		add(label1);
		textField1 = new JTextField(10);
		add(textField1);
		label2 = new JLabel("Enter your weight(kilograms)");
		add(label2);
		textField2 = new JTextField(10);
		add(textField2);
		button = new JButton("Enter");
		add(button);
		
		Handler handler = new Handler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		button.addActionListener(handler);
	}
	private class Handler implements ActionListener
	{
		double height =1.0;
		double weight =1.0;
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == button)
			{	
				try
				{
					height=Double.parseDouble(textField1.getText());
					weight=Double.parseDouble(textField2.getText());
					double BMI = weight/ (height*height);
					JOptionPane.showMessageDialog(null,"BMI: " + BMI);
				}
				catch(NumberFormatException e) {             
					System.out.println("Input wring format.");         
				}
			}
		}
	}
}