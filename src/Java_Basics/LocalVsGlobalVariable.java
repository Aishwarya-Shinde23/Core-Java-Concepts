package Java_Basics;

public class LocalVsGlobalVariable {
	
	//GLOBAL, CLASS variables 
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i); //Local Variable for main method
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		
		System.out.println(obj.name); //Access global variables using OBJECT_REFERENCE variable
		
		System.out.println(obj.age);
		
		obj.sum();
	}
	
	public void sum() {
		int i = 50; //Local Variables for sum method
		int j = 50;
		
		System.out.println(i);
		System.out.println(j);
		
	}
}
