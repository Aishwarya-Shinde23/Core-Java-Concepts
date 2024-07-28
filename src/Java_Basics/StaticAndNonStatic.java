package Java_Basics;

public class StaticAndNonStatic {

	String name = "Peter"; //NON-STATIC Global/ Class variable
	static int age = 28; //STATIC Global/ Class variable
	
	public static void main(String[] args) {
		
		/* RULES to call STATIC & NON-STATIC variable, method -->
		 * 1. STATIC : Call directly OR Call by class name
		 * 2. NON-STATIC : Call using OBJECT REFERENCE variable
		 */

		System.out.println(age); 
		
		sum(); 
		
		System.out.println(StaticAndNonStatic.age ); //classname.age --> STATIC variable
		
		StaticAndNonStatic.sum();
		
		StaticAndNonStatic obj = new StaticAndNonStatic(); //To access NON-STATIC methods create OBJECT
		
		System.out.println(obj.name); //using OBJECT REFERENCE variable
		
		obj.sendMail();
	}
	
	public void sendMail() {
		System.out.println("Send Mail Method");
	}
	
	public static void sum() {
		System.out.println("Sum Method");
	}

}
