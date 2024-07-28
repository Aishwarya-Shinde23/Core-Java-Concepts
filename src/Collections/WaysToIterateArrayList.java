package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToIterateArrayList {

	public static void main(String[] args) {

		ArrayList <String> ar = new ArrayList<String>();
		ar.add("Number 1");
		ar.add("Number 2");
		ar.add("Number 3");
		ar.add("Number 4");
		ar.add("Number 5");
		ar.add("Number 6");
		
		//1. Using Java 8 for each loop & lambda expression -
		ar.forEach(numbers -> {
			System.out.println(numbers);
		});
		
		System.out.println("------------------------------");
		
		//2.Using Iterator & while loop
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			
			String numbers = it.next();
			System.out.println(numbers);
		}
		
		System.out.println("------------------------------");
		
		//3.Using Iterator & ForEachReamainin() using lambda expression in Java 8
		it = ar.iterator();
		it.forEachRemaining(numbers -> {
			System.out.println(numbers);
		});

		System.out.println("------------------------------");
		
		//4.Using ForEach loop -
		for(String numbers : ar) {
			System.out.println(numbers);
		}
		
		System.out.println("------------------------------");
		
		//5.Using FOR Loop with order/ index 
		
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("------------------------------");
		
		//6.Using a list iterator() to traverse in reverse order
		
		ListIterator<String> arIterator = ar.listIterator(ar.size());
		while(arIterator.hasPrevious()) {
			String numbers = arIterator.previous();
			System.out.println(numbers);
		}
	
	}

}
