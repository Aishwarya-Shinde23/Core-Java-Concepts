package ThisKeyword;

public class ThisKeyword {
	
	//THIS KEYWORD --> Used to initialize global variables with the current value of local variables of constructor
	
	String name;
	int age;
	
	public ThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword("Tom", 28);
	}

}
