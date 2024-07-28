package ExceptionHandling.ThrowsKeyword;

public class ThrowsKeyword {

public static void main(String[] args)throws ArithmeticException {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		
	}
	
	public void sum() throws ArithmeticException {
		div();
	}
	
	public static void div() throws ArithmeticException  {
		int i = 9/0;
		System.out.println("Test"); //Did not get printed in output as exception is not handled using TRY-CATCH
	}
	
	//Refer code - ThrowsSolution1 & ThrowsSolution2 to resolve the above issue
	
}