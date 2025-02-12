package Collections.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

import Collections.ArrayList.Employee;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee ("Tom", 25, "QA");
		Employee e2 = new Employee ("Peter", 26, "Admin");
		Employee e3 = new Employee ("Nick", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//To traverse the hashmap - 
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println("Employee " + key + " Info : ");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
		
		System.out.println("----------------------------------");
		
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(9)); //Gives 'null' value in output for index not present
		
		//To print all values of HashMap - 
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+ "-" + m.getValue());
		}
		
		//To remove value from HashMap - 
		hm.remove(4);
		System.out.println(hm);
		
	}

}
