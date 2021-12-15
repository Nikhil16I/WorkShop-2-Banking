package com.Banking;

public class AccountHoldingMain {
	public static void main(String[] args) {
		SavingsAccount Account1= new SavingsAccount(2000);//Saver Account 1
		SavingsAccount Account2= new SavingsAccount(30000);//Saver Account 2
		
		SavingsAccount.ModifyInterestRate(4*100);//for 4% Annual interest
		System.out.println("For 4% Annual Interest Rate");
		   //Accnt1 Balance
		Account1.CalculateMonthlyInterest();	
		System.out.println("Account 1 - Balance is = "+Account1.getsavingsbalance());
		
		   //Accnt2 Balance
		Account2.CalculateMonthlyInterest();
		System.out.println("Account 2 - Balance is ="+Account2.getsavingsbalance());
		
		//-----*----*--//
		
		SavingsAccount.ModifyInterestRate(5*100);//for 5% Annual Interest Rate
		System.out.println("For 5 % Annual Interest Rate");
		   //Accnt1 balance
		Account1.CalculateMonthlyInterest();
		System.out.println("Account 1 - Balance is = "+Account1.getsavingsbalance());
		
		   //Accnt2 balance
		Account2.CalculateMonthlyInterest();
		System.out.println("Account 2 - Balance is ="+Account2.getsavingsbalance());

	  }

}
