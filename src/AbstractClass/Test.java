package AbstractClass;

public class Test extends Shape {

	public static void main(String[] args) {
		
		Shape s = new Test();
		s.drawing();
		s.fill();		
		System.out.println(Shape.color);
		
		Test test = new Test(); //Calls Shape class constructor
	}

	@Override
	void drawing() {
		System.out.println("Test------------drawing");		
	}

}
