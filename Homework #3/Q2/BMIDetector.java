//Q2
public class BMIDetector
{
	double height = 1.7;
	double weight = 100.0;
	double bmi = 0.0;
	
	public BMIDetector()
	{
		bmi = weight / (height * height);
		System.out.println("BMI: "+ bmi);
		try{
			MeasureHeightAndWeight();
		  } catch(Message m){
		    if(bmi>24 || bmi<18.5)
			{
				System.out.println("Warning: "+ m);
			}
		}			
	}
	public void MeasureHeightAndWeight() throws Message
	{
		throw new Message();
	}
	public static void main(String[] args)
	{
		new BMIDetector();
	}
}