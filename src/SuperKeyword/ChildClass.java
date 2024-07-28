package SuperKeyword;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
		super();
		System.out.println("Child Class Default Constructor");
	}
	
	public ChildClass(int p) {
		super(10);
		System.out.println("Child Class Constructor --> Value of p : " + p);
	}
	
	public ChildClass(int l, int m) {
		super(30, 40);
		System.out.println("Child Class Constructor --> Value of l : " + l);
		System.out.println("Child Class Constructor --> Value of m : " + m);
	}
	

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		ChildClass obj1 = new ChildClass(20);
		ChildClass obj2 = new ChildClass(50, 60);

	}

}
