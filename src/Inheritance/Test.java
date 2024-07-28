package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		/*POINTS TO KNOW - 
		 * BMW class is public hence OBJECT can be created
		 * Whenever we have 2 methods with same name & argumets [start()] in PARENT & CHILD class, first preference is given to CHILD class method
		 */
		
		BMW b = new BMW();
		
		b.start(); //BMW ----------> start method
		b.stop();  //Car ----------> stop method
		b.refuel(); //Car ----------> refuel method
		b.theftSafety(); //BMW ----------> theftSafety method
		b.engine(); //Vehicle ---------- engine
		
		System.out.println("-----------------------------------");
		
		/*TOP CASTING - Child class OBJECT referred by PARENT class reference variable
		 * This is also called as DYNAMIC POLYMORPHISM/ RUNTIME POLYMORPHISM
		 * Only overridden methods or Parent class methods will be called using DYNAMIC POLYMORPHISM
		 */
		
		Car c = new BMW();
		c.start(); //BMW ----------> start method
		c.stop();  //Car ----------> stop method
		c.refuel(); //Car ----------> refuel method
		//c.theftSafety(); --> This method cannot be accessed due to security issue as Parent cannot inherit properties of child class 
		
		System.out.println("-----------------------------------");
		
		/*DOWN CASTING - Parent class OBJECT referred by CHILD class reference variable
		 * We need to casr the OBJECT w.r.t Object reference variable to convert CAR Object to BMW Object
		 */
		
		BMW b1 = (BMW)new Car();
		b1.refuel(); //ClassCastException
		
	}

}
