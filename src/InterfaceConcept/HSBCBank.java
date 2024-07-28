package InterfaceConcept;

public class HSBCBank implements USBank, BrazilBank { 
	
	/*This is called MULTIPLE INHERITANCE [Multiple Parent class and multiple child classes] 
	 * (Has - a : relationship)--> [C to C using extends keyword]
	 * (Is - a : relationship)--> [I to C using implements keyword] 
	 */
	
	public void credit() {
		System.out.println("HSBCBank ---------- credit");
	}
	
	public void debit() {
		System.out.println("HSBCBank ---------- debit");
		
	}
	
	public void transferMoney() {
		System.out.println("HSBCBank ---------- transferMoney");
	}
		
	public void educationLoan() {
		System.out.println("HSBCBank ---------- educationLoan"); //HSBCBank method
	}
	
	public void carLoan() {
		System.out.println("HSBCBank ---------- carLoan"); //HSBCBank method
	}
	
	public void mutualFunds() {
		System.out.println("BrazilBank ---------- mutualFunds");
	}
 }
