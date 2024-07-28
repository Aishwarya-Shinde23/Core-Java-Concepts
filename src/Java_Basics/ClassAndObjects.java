package Java_Basics;

public class ClassAndObjects {
	
	/* GLOBAL VARIABLES - 
	 * These are called CLASS/ GLOBAL variables and are declared before the main method
	 * These can be called & initialized once OBJECT is created in main method().
	 */

	int model; 
	int wheel;
	
	public static void main(String[] args) {
		
		/*POINTS TO KNOW - 
		 * SYNTAX to create Object --> classname obj.name = new classname();
		 * ClassAndObjects = classname
		 * a = OBJECT reference variable
		 * new = keyword used to create OBJECT
		 * new ClassAndObjects() = OBJECT of Class
		 * Duplicate OBJECT_REFERENCE variable is not allowed
		 
		 * OBJ a = OBJECT 1
		 * OBJ b = OBJECT 2
		 * OBJ c = OBJECT 3
		 */
				
		ClassAndObjects a = new ClassAndObjects();
				
		ClassAndObjects b = new ClassAndObjects();
		
		ClassAndObjects c = new ClassAndObjects();
				
		a.model = 2017;
		a.wheel = 4;
		
		b.model = 2018;
		b.wheel = 4;
		
		c.model = 2019;
		c.wheel = 4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references -->");
		//OBJECT reference a will stop referring to OBJECT 1 and start referring OBJET 2
		//OBJECT reference b will stop referring to OBJECT 2 and start referring OBJET 3
		//OBJECT reference c will stop referring to OBJECT 3 and start referring OBJET 2 (as a refers OBJECT 2 & c=a)
		//None of the reference variable (a,b,c) refers OBJECT 1
		
		a=b; 
		b=c; 
		c=a; 
		
		System.out.println(a.model); //2018
		System.out.println(a.wheel); //4
		
		System.out.println(b.model); //2019
		System.out.println(b.wheel); //4
		
		System.out.println(c.model); //2018
		System.out.println(c.wheel); //4
		
		a.model = 2016; 
		System.out.println(a.model); //2016
		System.out.println(c.model); //2016
		
		c.model = 2015;
		System.out.println(a.model); //2015
		System.out.println(c.model); //2015
		
	}

}
