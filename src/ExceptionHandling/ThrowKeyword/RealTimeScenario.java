package ExceptionHandling.ThrowKeyword;

public class RealTimeScenario {

	public static void main(String[] args) {
		
		/* SCENARIO - 
		 * For a Data driven framework an excel document contains certain columns with value = 'Y/N' & some as blank/ null 
		 * These blank/null values can trigger an Exception at runtime and stop execution of code
		 * How can we handle it using throw & TRY-CATCH block ?
		 */
		
		String Exe_flag = " ";
		if(Exe_flag.equals(" ")) {
			
			try {
				throw new Exception("Exception --> Exe_flag is blank");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Test");
		}

	}

}
