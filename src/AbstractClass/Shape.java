package AbstractClass;

public abstract class Shape {
	
	static String color = "Blue";
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Shape----------fill");
	}
	
	//We can also create constructor in abstract class but NOT in interface
	Shape(){
		System.out.println("Shape class constructor");
	}
	

}
