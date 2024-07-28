package ExceptionHandling.ThrowsKeyword;

public class ThrowsSolution1 {

	public static void main(String[] args) {

		ThrowsSolution1 obj1 = new ThrowsSolution1();
		obj1.sum();
		System.out.println("Test");
	}
	
	public void sum(){
		division();
	}
	
	public static void division(){
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled using TRY-CATCH in div()");
		}
	}

}
