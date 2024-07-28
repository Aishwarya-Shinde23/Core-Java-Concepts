package Abstraction;

public class ICICIBank extends Finance implements USBank, RBIBank {

	//ICICIBank class methods -
	
	public void mutualFunds() {
		System.out.println("ICICIBank-----------mutualFunds");		
	}
	
	public void insurance() {
		System.out.println("ICICIBank-----------insurance");		
	}

	//RBIBank Interface overridden methods -
	
	@Override
	public void educationLoan() {
		System.out.println("ICICIBank-----------educationLoan");		
	}

	@Override
	public void carLoan() {
		System.out.println("ICICIBank-----------carLoan");		
	}

	@Override
	public void homeLoan() {
		System.out.println("ICICIBank-----------homeLoan");		
	}

	//USBank Interface overridden methods -
	
	@Override
	public void credit() {
		System.out.println("ICICIBank-----------credit");		
	}

	@Override
	public void debit() {
		System.out.println("ICICIBank-----------debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("ICICIBank-----------transferMoney");		
	}

	@Override
	public void trading() {
		System.out.println("ICICIBank-----------trading");
		
	}

}
