//Q2 Exercise 9.3

public class BasePlusCommissionEmployee
{
	private CommissionEmployee commissionEmployee;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate , double salary)
	{
		commissionEmployee.setFirstName(first);
		commissionEmployee.setLastName(last);
		commissionEmployee.setSocialSecurityNumber(ssn);
		commissionEmployee.setGrossSales(sales);
		commissionEmployee.setCommissionRate(rate);
		setBaseSalary(salary);
	}
	public void setBaseSalary(double salary)
	{
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	public double earnings()
	{
		return getBaseSalary() + this.commissionEmployee.earnings();
	}
	public String toString()
	{
		return String.format("%s %s\n%s: %.2f", "base-salaried", this.commissionEmployee.toString(), "base salary", getBaseSalary());
	}
}
