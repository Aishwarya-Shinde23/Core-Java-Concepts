package Java_Basics;

public class MethodOverloading {

	public static void main(String[] args) {
		
	/*METHOD OVERLOADING --> Method name is same with different arguments within the same class
	 * Duplicate methods i.e., same method name with same number of arguments are not allowed within the same class
	 */
		
	MethodOverloading obj = new MethodOverloading();
	
	obj.sum();
	
	obj.sum(10);
	
	obj.sum(50, 50);
	
	obj.sum("Selenium");
	
	obj.test();

	}
	
	public void sum() {
		System.out.println("Sum method --> Zero parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum method --> 1 input parameter");
		
		System.out.println(i);
	}
	
	public void sum(int m, int n) {
		System.out.println("Sum method --> 2 input parameter");
		
		System.out.println(m+n);
	}
	
	public void sum(String s) {
		System.out.println("Sum method -->1 string input parameter"); //ALLOWED as input parameter is of different datatype
		
		System.out.println(s);
	}
	
	public void test() {
		System.out.println("Demo Method"); //NOT ALLOWED as method name is different
	}
	
}
