package HashTableConcept;

import java.util.Hashtable;

public class HashTableBasics {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Demo");
		h.put("C", "Selenium");
		
		System.out.println(h.size());
		
		h.put(1, "100");
		h.put(2, "200");
		h.put(3, "300");
		
		System.out.println(h.size());
		
		System.out.println(h.get("B"));
		System.out.println(h.get(2));
		
		System.out.println("--------------------");

		//GENERIC HASHTABLE - Integer
		Hashtable <Integer, Integer> h1 = new Hashtable <Integer, Integer>();
		h1.put(1, 520);
		h1.put(2, 950);
		h1.put(3, 320);
		//h1.put("C", "Selenium"); --> String values not allowed
		
		System.out.println(h1.get(3));
		
		System.out.println("--------------------");
		
		//GENERIC HASHTABLE - Integer
		Hashtable <Integer, String> h2 = new Hashtable <Integer, String>();
		h2.put(1, "Test");
		h2.put(2, "Automation");
		h2.put(3, "Selenium");
		//h1.put("C", "Selenium"); --> String values not allowed
				
		System.out.println(h2.get(1));
				
	}

}
