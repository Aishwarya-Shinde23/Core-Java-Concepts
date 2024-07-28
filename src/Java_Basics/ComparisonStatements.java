package Java_Basics;

public class ComparisonStatements {

	public static void main(String[] args) {
		
		/* if - else:
		 * POINTS TO KNOW: - 
		 * if(Boolean condition) is true, if body statement will execute.
		 * if(Boolean condition) is false, else body statement will execute.
		 */
		
		//Example 01: -
		
		int a = 180;
		int b = 150;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		/*Example 02: -
		 * POINTS TO KNOW: - 
		 * '=' --> Assignment Operator
		 * '==' --> Comparison Operator
		 */
		
		int c = 200;
		int d = 200;
		
		if(c==d) {
			System.out.println("Values of c and d are equal");
		}
		else {
			System.out.println("Values c and d are not equal");
		}
		
		/*NESTED if-else: - 
		 * POINTS TO KNOW: - 
		 * if(Boolean condition) is true, if body statement will execute.
		 * if(Boolean condition) is false, it will move to else if block.
		 * It will check for else if(condition), if it is true else if body statement will execute.
		 * If it is false, it will move to else block and execute else body statement.
		 * '&' --> AND Operator is used to compare two conditions.
		 * < , > , <= , >= , ==, != --> Different comparison operators in Java
		 */
		
		//Example 03 - Write a logic to find out highest number
		
		int p = 1000;
		int q = 2000;
		int r = 3000;
		
		if (p>q & p>r) {
			System.out.println("p is highest number");
		}
		else if(q>r) {
			System.out.println("q is highest number");
		}
		else {
			System.out.println("r is highest number");
		}
		 
	}

}
