package Abstraction;

public class TestBank {

	public static void main(String[] args) {

		ICICIBank ic = new ICICIBank();
		
		System.out.println("Minimum balance should be : " + USBank.min_bal);
		
		//ICICIBank Methods - 
		ic.mutualFunds();
		ic.insurance();
		
		//RBIBank Methods - 
		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();
		
		//USBank Methods - 
		ic.credit();
		ic.debit();
		ic.transferMoney();
		ic.trading();
		
		//Finance Method - 
		ic.stock();
		
		System.out.println("------------------------------------------");
		
		USBank us = new ICICIBank();
		us.credit();
		us.debit();
		us.transferMoney();
		us.trading();
		
	}

}
