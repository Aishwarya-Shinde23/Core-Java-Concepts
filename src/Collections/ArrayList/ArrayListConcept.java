package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		//To store user-defined class OBJECTS in ArrayList - 
		Employee e1 = new Employee ("Tom", 25, "QA");
		Employee e2 = new Employee ("Peter", 26, "Admin");
		Employee e3 = new Employee ("Nick", 27, "Dev");
		
		ArrayList <Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		//To traverse the values of ArrayList - 
		Iterator<Employee> it = ar.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("------------------------------");
		
		ArrayList <String> ar1 = new ArrayList<String>();
		ar1.add("Test");
		ar1.add("Selenium");
		ar1.add("QTP");
				
		ArrayList <String> ar2 = new ArrayList<String>();
		ar2.add("QA");
		ar2.add("Java");
		ar2.add("Automation");
				
		//To merge 2 ArrayLists we use - addAll()
		
		ar1.addAll(ar2);
		
		for(int i=0; i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		System.out.println("------------------------------");		
		
		//To remove values from ArrayList we use - removeAll()
		
		ar1.removeAll(ar2);
		
		for(int j=0; j<ar1.size();j++) {
			System.out.println(ar1.get(j));
		}
		
		System.out.println("------------------------------");	
		
		//To print the common value in both ArrayList OBJECTS - retainAll()

		ArrayList <String> ar4 = new ArrayList<String>();
		ar4.add("Test");
		ar4.add("Demo");
		
		ArrayList <String> ar5 = new ArrayList<String>();
		ar5.add("Automation");
		ar5.add("Demo");
		
		ar4.retainAll(ar5);
		
		for(int k=0; k<ar4.size();k++) {
			System.out.println(ar4.get(k));
		}			
	}
}
