package ConstructorConcept;

public class ConstructorConcept {
	
	//Constructor Overloading --> Same name different arguments
	//Even if Default constructor is not declared, it will be called when OBJECT is created [ConstructorConcept obj = new ConstructorConcept();]
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	//PARAMETERIZED CONSTRUCTOR
	public ConstructorConcept(int i) { 
		System.out.println("Single Parameter Constructor");
		System.out.println("The value of i : " + i);
	}
	
	//PARAMETERIZED CONSTRUCTOR
	public ConstructorConcept(int m, int n) {
		System.out.println("Double Parameter Constructor");
		System.out.println("The value of m : " + m);
		System.out.println("The value of n : " + n);
	}
	
	public static void main(String[] args) {

		ConstructorConcept obj = new ConstructorConcept(); //Default Constructor is called 
		
		ConstructorConcept obj1 = new ConstructorConcept(10);
		
		ConstructorConcept obj2 = new ConstructorConcept(60, 40);

	}

}
