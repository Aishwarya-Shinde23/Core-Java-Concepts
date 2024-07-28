package ExceptionHandling.ThrowKeyword;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("Test");
		
		try {
			throw new Exception("Automation Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Demo"); //If TRY-CATCH block is not written, this statement is Unreachable/ Dead code
	}

}
