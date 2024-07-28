package ExceptionHandling.ThrowsKeyword;

public class ThrowsSolution2 {

	public static void main(String[] args) {

		ThrowsSolution2 obj2 = new ThrowsSolution2();
		obj2.sum();
		System.out.println("Test");
	}
	
	public void sum(){
		try {
			division();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled using TRY-CATCH in sum()");
		}
		
	}
	
	public static void division() throws ArithmeticException{
		int i = 9/0;
	}

}
