package FinallyConcept;

public class FinallyConcept {

	/*FINALLY - 
	 * Finally is used in association with TRY-CATCH block
	 * Finally block will execute (100%) after TRY-CATCH block dspite of any Exception triggered
	 */
	
	//EXAMPLE 01 - [Exception triggered manually]
	
	public static void test1() {
		
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("Test");
			}
		catch(Exception e) {
			System.out.println("Inside catch method");
		}
		
		finally {
			System.out.println("Inside finally block of test1 method");
		}
	}
	
	//EXAMPLE 02 - [Exception triggered manually]
	
	public static void test2() {
		
		System.out.println("----------------------------------------");
		
		try {
			System.out.println("Inside test2 method");
		}
		
		finally {
			System.out.println("Inside finally block of test2 method");
		}
	}
	
	//EXAMPLE 03 - [Exception triggered automatically]
	
		public static void division() {
			
			System.out.println("-------------------------------------------------------");
			
			int i = 10;
			
			try {
				System.out.println("Inside try block");
				int k = i/0; //Exception will be thrown as NO number can be divided by zero
			}
			catch (ArithmeticException e) {
				System.out.println("Inside catch block");
				System.out.println("Divide by zero error");
			}
			
			finally {
				System.out.println("Execute this block even after Exception is triggered");
			}
		}
		
		public static void main(String[] args) {
			
			test1(); //static method called directly
			
			FinallyConcept.test2(); //static method called using classname.method
			
			FinallyConcept.division();
		}
}