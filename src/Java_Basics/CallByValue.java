package Java_Basics;

public class CallByValue {

	public static void main(String[] args) {
		
		CallByValue obj = new CallByValue();
		
		obj.testsum(10, 10); 
		
		//OR
		
		int x = 50;
		int y = 50;
		obj.testsum(x, y); 
		
		obj.division(500, 5); //Initally x = 500 & y = 5
	}
	
	public int testsum(int x, int y) {
		int z = x+y;
		System.out.println(z);
		
		return z;
	}
	
	public int division(int x, int y) {
		int x1 = 100; //Value of x updated to 100
		int y1 = 20; //Value of y updated to 20
		int c = x1/y1;
		System.out.println(c); //5 --> Will consider the updated value in method and NOT initial values declared
		
		return c;
	}
	

}
