package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		//This is called COMPILE-TIME POLYMORPHISM
		//All methods of Interface and Class are accessible using OBJECT reference variable 'h'.
		
		HSBCBank h = new HSBCBank();
		
		h.credit();
		h.debit();
		h.transferMoney();
		h.educationLoan();
		h.carLoan();
		h.mutualFunds();
		
		System.out.println("------------------------------");
		
		//DYNAMIC POLYMORPHISM
		//We cannoy access HSBCBank methods, only overridden methods will be called [educationLoan(), carLoan()]
		
		USBank u = new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();
		
		System.out.println("------------------------------");
		
		System.out.println("The minimum balance must be : " + USBank.min_bal); //To call STATIC variable, use classname.variable
		
	}

}
