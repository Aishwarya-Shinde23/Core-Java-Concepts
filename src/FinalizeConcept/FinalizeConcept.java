package FinalizeConcept;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("Inside finalize method");
	}
		
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
	
		f1 = null;
		
		System.gc();
		
	}

}
