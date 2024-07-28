package ExceptionHandling;

public class TryCatch {
	
	public static void division() {
		
		int i = 10;
		
		try {
			int k = i/0; //Exception will be thrown as NO number can be divided by zero
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("ABC");
	}
		

	public static void main(String[] args) {

		division();

	}

}
