//Fig. 10.15
public class PayableInterfaceTest
{
	public static void main(String[] args)
	{
		Payable[] payableObjects = new Payable[6];
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("Jason", "Terry", "111-11-1111", 800.00);
		payableObjects[3] = new HourlyEmployee("Chris", "Kaman", "222-22-2222", 103.00, 99.00);
		payableObjects[4] = new CommissionEmployee("O.J.", "Mayo", "333-33-3333", 78.00, 0.8);
		payableObjects[5] = new BasePlusCommissionEmployee("David", "Lee", "444-44-4444", 97.00, 0.92, 800.00*1.1);
		
		System.out.println("Invoices and Employees processed polymorphically:\n");
		for(Payable currentPayable : payableObjects)
		{
			System.out.printf("%s \n%s: $%,.2f\n\n",
				currentPayable.toString(),
				"Payment due", currentPayable.getPaymentAmount());
		}
	}
}