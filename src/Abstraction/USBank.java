package Abstraction;

public interface USBank {
	
	int min_bal = 10000; //Interface variables are by default STATIC in nature ad value cannot be modified once declared
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	public void trading();

}

