package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {

	public static void main(String[] args) {

		//Implement a singly linkedlist -
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("HP ALM");
		ll.add("RFT");
		ll.add("RPA");
				
		System.out.println("Contents of LinkedList : " + ll);
		
		//Add first and last element in linkedlist - 
		ll.addFirst("Test Automation");
		ll.addLast("Java");
		
		System.out.println("New contents of LinkedList : " + ll);
		
		//Get the value of specific index
		ll.get(0); 
		
		//Set the value to a specific index
		ll.set(3, "Postman");
		ll.set(6, "Rest Assured");
		
		System.out.println("Updated contents of LinkedList : " + ll);
		
		//Remove element from specific index, first & last in linkedlist - 
		ll.remove(0);
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("After removal contents of LinkedList are : " + ll);
		
		System.out.println("------------------------------");
		
		//Different ways of iterating LinkeList - 
		
		//1. For loop
		for(int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("------------------------------");
		
		//2.Advance For Loop - 
		
		for(String s : ll) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		//3.using Iterator - 
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("------------------------------");
		
		//4.While loop - 
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		System.out.println("------------------------------");
		
	}

}
