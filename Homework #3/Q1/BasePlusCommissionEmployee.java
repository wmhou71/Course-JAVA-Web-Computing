//Fig. 10.8
public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable
{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary)
	{
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	public void setBaseSalary(double salary)
	{
		baseSalary = (salary < 0.0)? 0.0 : salary;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	@Override
	public double getPaymentAmount()
	{
		return getBaseSalary() + super.getPaymentAmount();
	}
	@Override
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}
}