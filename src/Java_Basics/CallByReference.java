package Java_Basics;

public class CallByReference {
	
	//Global or class variables
	int p;
	int q;

	public static void main(String[] args) {
		
		//Write a logic to swap two numbers and explain CallByReference concept
		
		CallByReference obj = new CallByReference();
		
		//BEFORE-SWAP
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
		//AFTER-SWAP
		System.out.println(obj.p); //60
		System.out.println(obj.q); //50
	}
	
	public void swap (CallByReference t) {
		int temp; //Temporary variable
		temp = t.p;
		t.p = t.q;
		t.q = temp;

	}

}
