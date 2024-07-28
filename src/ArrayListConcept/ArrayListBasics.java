package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		
		// NON-GENERIC ARRAYLIST -
				
		ArrayList ar = new ArrayList();
				
		//To add values in ArrayList
		ar.add(100);
		ar.add("Tom");
		ar.add(12.33);
				
		System.out.println(ar.size()); //3
				
		ar.add('M');
		ar.add(500);
		ar.add("Peter");
		ar.add('A');
		ar.add(1000);
				
		System.out.println(ar.size()); //8
				
		System.out.println(ar.get(1));
				
		// System.out.println(ar.get(9)); Exception [java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 5]
				
		//To print all values of ArrayList
				
		System.out.println("-------Print all values of ArrayList-------");
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
				
		ar.remove(0);
		System.out.println(ar.size()); //7
		
		System.out.println("--------------------");
				
		//GENERIC ARRAYLIST - Integer
		ArrayList <Integer> ar1 = new ArrayList <Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		//ar1.add("A"); String values are not allowed to be added
		System.out.println(ar1.get(3));
		
		System.out.println("--------------------");
				
		//GENERIC ARRAYLIST - String
		ArrayList <String> ar2 = new ArrayList <String>();
		ar2.add("A");
		ar2.add("B");
		ar2.add("C");
		ar2.add("D");
		ar2.add("E");
		//ar1.add(10); Integer values are not allowed to be added
		System.out.println(ar2.get(4));
		
		/*SCENARIO - 
		 * If we are not sure about kind of data that will be stored in ArrayList OBJECT, we define Arraylist as - 
		 * ArrayList<E> ar3 = new ArrayList<E>();
		 * public static <E> void main(String [] args)
		 */
	
	}

}
