package org.override;

public class AxisBank extends BankInfo {

	
	public void deposit()
	{
		System.out.println("Deposit made in Axis Bank is 5000");
	}
	
	
	public static void main(String Args[])
	{
		AxisBank childBank = new AxisBank();
		//child method will be called
		childBank.deposit();
		childBank.fixed();
		childBank.saving();
		
		
		BankInfo ParentBank = new BankInfo();
		//parent method is called
		ParentBank.deposit();
		ParentBank.fixed();
		ParentBank.saving();
		
	}
}
