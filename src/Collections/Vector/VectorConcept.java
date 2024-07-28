package Collections.Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
		Vector<Integer> myVector = new Vector<Integer>();
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		myVector.add(14);
		myVector.add(16);
		
		System.out.println(myVector);
		
		System.out.println(myVector.get(3));
		
		Vector<Integer> myVector1 = new Vector<Integer>();
		myVector1.add(10);
		myVector1.add(11);
		
		myVector.addAll(myVector1);
		System.out.println(myVector); //Duplicate values are allowed
		
		System.out.println("----------------------------");
		
		System.out.println("Iterate using For each -->");
		for(Integer e : myVector){
			System.out.println(e);
		}
		
		System.out.println("----------------------------");
		
		System.out.println("Using For Loop -->");
		for(int i =0; i<myVector.size();i++) {
			System.out.println(myVector.get(i));
		}
			
		System.out.println("----------------------------");

		System.out.println("Using Iterator -->");
		Iterator <Integer> itr = myVector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		System.out.println("----------------------------");
		
		System.out.println("Sorting using Collections -->");
		Collections.sort(myVector);
		System.out.println(myVector);
	}

}
