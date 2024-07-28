package Collections.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		/*To create a clone copy - 
		 * 1. Create 2 Hashtable OBJECTS (h1, h2)
		 * 2. h1 = has some values, h2 = no values
		 * 3. use h1.clone() & cast it to (Hashtable)
		 */
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("Values from h1 : " + h1);

		System.out.println("Values from h2 : " + h2);
		
		//To clear or delete value - Cloned hashtable will retainAll values even if original hashtable is cleared
		h1.clear();
		
		System.out.println("Values from h1 : " + h1);

		System.out.println("Values from h2 : " + h2);
		
		//contains value - 
		
		Hashtable h3 = new Hashtable();
		h3.put("A", "Jack");
		h3.put("B", "Rose");
		h3.put("C", "Lisa");
		
		if(h3.contains("Jack")) {
			System.out.println("Value is found !!");
		}
		
		//To print all values from hashtable --> 
		//iterate using Enumeration concept --> ue elements()
		
		Enumeration e = h3.elements();
		System.out.println("Print values from h3 -->");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//To print all values from hashtable --> using EntrySet()
		System.out.println("Print values from h3 using EntrySet-->");
		Set s = h3.entrySet();
		System.out.println(s);
		
		//equals() - used to compare 2 hashtables
		if(h1.equals(h3)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		//To get value a specific key - 
		System.out.println(h3.get("A"));
		
		//To get hashcode of a hashtable, we use - 
		System.out.println(h1.hashCode()); //No values are present
		System.out.println(h2.hashCode());
		
		//No null keys & values allowed - Throws NullPointerException
		h1.put(null, "Test");
		h1.put("Demo", null);
		
		//Generic hashtable can be declared as - 
		//Hashtable <String, String> h4 = new Hashtable <String, String>();
	}

}
