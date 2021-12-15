package com.Banking;

public class SavingsAccount {
    static  double AnnualInterestRate;//static variable 
	double SavingsBalance; //instance variable
	
	/*Constructor*/
	public SavingsAccount(double SavingsBalance) {
		this.SavingsBalance= SavingsBalance;//Saving balance value		
	}
		
	public static void ModifyInterestRate(double NewAnnualInterestRate) {
		AnnualInterestRate=NewAnnualInterestRate;
	}//for Modifying the Interest Rate
	
    public double getsavingsbalance() {
    	return this.SavingsBalance;
    }
    
    /*Calculating Monthly Interest Operation*/
    public double CalculateMonthlyInterest() {
   	double Monthlyinterest = (SavingsBalance * AnnualInterestRate)/12;//Calculating for Monthly Interest
    	SavingsBalance=SavingsBalance+Monthlyinterest;
    	return SavingsBalance;   	
    }  
}
