package Java_Basics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		/*WHILE Loop:
		 * SYNTAX - 
		1. INITIALIZATION - Declare a variable
		2. CONDITIONAL PART - While (Condition){ s.o.pln (variable);}
		3. INCREMENTAL/ DECREMENTAL PART - increment/ decrement declared variable by 1
		 */
		
		//EXAMPLE - WHILE Loop
		int i  = 1;
		while(i<=10) {
			System.out.println(i);
			i=i+1; 
		}
		
		/*FOR Loop:
		 * SYNTAX - 
		 1. FOR (INITIALIZATION - Declare a variable ; CONDITIONAL PART ; INCREMENTAL/ DECREMENTAL PART)
		 For loop will be executed until condition is satisfied, when the condition is false it will come out of loop
		 */
		
		//EXAMPLE 01 - FOR Loop (Print number 1 to 10)
			
		for (int k =1; k>=10; k++) {
			System.out.println(k);
		}
		
		//EXAMPLE 02 - FOR Loop (Print number 1 to 10 in reverse order)
		for (int l =10; l>=1; l--) {
			System.out.println(l);
		}
		
		//EXAMPLE 02 - FOR Loop (Print number 10 to -10)
		for (int m =10; m>=-10; m--) {
			System.out.println(m);
		}
	}

}
