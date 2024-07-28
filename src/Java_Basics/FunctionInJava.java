package Java_Basics;

public class FunctionInJava {
		
		/*POINTS TO KNOW -
		 * There are mainly 3 types of functions given below - 
		 * TYPE 1 : No input, No output
		 * TYPE 2 : No input, Get output
		 * TYPE 3 : Pass input, Get output 
		 * To call Non-Static methods we need to create object and call those methods
		 */
		
		/*TYPE 1 : No input, No output [NON-STATIC METHOD]
		    public static void main(Sting [] args) {
				
			}
		}*/
		
		//TYPE 1 : No input, No output [NON-STATIC METHOD]
		
		public void test(){
			System.out.println("Test Method");
		}
		
		/*TYPE 2 : No input, Get output [NON-STATIC METHOD]
		 * The return type of method depends on datatype of value we are returning
		 * For below example --> we are returning integer data hence method return type should be int
		 */
		 
		 public int pqr(){
			System.out.println("PQR Method");
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c;
		}
		
		public String qa(){
			System.out.println("QA Method");
			String s = "Selenium";
			
		 return s;
		 }
		
		//TYPE 3 : Pass input, Get output [NON-STATIC METHOD]
		
		 public int division (int x, int y) {
			 System.out.println("Division Method");
			 int d = x/y;
			 
			 return d;
		 }
		 
		 public static void main(String[] args) {
			 
			 FunctionInJava obj = new FunctionInJava();
			 
			 obj.test(); //Test Method
			 
			 //obj.pqr(); //obj.pqr() will return only PQR Method in output console 
			 
			 int a = obj.pqr(); //For methods where we are using retrun to obtain a value, we need to call such method this way
			 System.out.println(a);
			 
			 //obj.qa();
			 
			 String b = obj.qa();
			 System.out.println(b);
			 
			 //obj.division(10, 30);
			 
			 int c = obj.division(50, 10);
			 System.out.println(c);
			 
	}

}
