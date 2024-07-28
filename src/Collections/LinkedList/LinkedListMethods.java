package Collections.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList <String> names = new LinkedList <String>();
		
		//Add values in names LinkedList - 
		names.add("Tom");
		names.add("Peter");
		names.add("Nick");
		names.add("Rob");
		names.add("Dan");
		
		System.out.println(names.size());
		System.out.println(names);
		
		System.out.println(names.get(0));
		
		System.out.println("----------------------------");
		
		//To iterate the values - 
		
		Iterator <String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------------");
		
		names.add("Lisa");
		names.add(0, "Steve");
		
		System.out.println(names);
		
		LinkedList <String> users = new LinkedList <String>();
		
		users.add("Trump");
		users.add("Lexi");
		
		System.out.println(users);
		
		//Add users LL values in names LL - 
		names.addAll(users);
		System.out.println(names);
		
		names.addFirst("Ram");
		names.addLast("Shivet");
		System.out.println(names);
		
		System.out.println("----------------------------");
		
		//To remove values from LL - 
		names.removeFirst();
		names.removeLast();
		names.remove(0);
		
		System.out.println(names);
		
		names.removeAll(users);
		System.out.println(names);
		
		//To remove all values from LL - 
		names.clear();
		System.out.println(names);
		
		System.out.println("----------------------------");
		
		//To print LL in ascending order - 
		LinkedList <String> lang = new LinkedList <String>();
		lang.add("Java");
		lang.add("Ruby");
		lang.add("Python");
		lang.add("JS");
		
		System.out.println(lang.size());
		
		Iterator <String> it1 = lang.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("----------------------------");
		
		//To print the LL in reverse order -
		for(String e : lang){
			System.out.println(e);
		}
		
		System.out.println("----------------------------");
		
		//To sort using Collections class
		
		Collections.sort(lang);
		System.out.println(lang);
	
	}

}
