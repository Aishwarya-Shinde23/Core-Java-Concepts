package SuperKeyword;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("Parent Class default constructor");
	}
	
	public ParentClass(int i) {
		System.out.println("Parent Class constructor --> Value of i : " + i);
	}
	
	public ParentClass(int j, int k) {
		System.out.println("Parent Class Constructor --> Value of j : " + j);
		System.out.println("Parent Class Constructor --> Value of k : " + k);
	}
	
}
