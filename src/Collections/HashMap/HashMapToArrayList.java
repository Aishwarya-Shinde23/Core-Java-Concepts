package Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {

		HashMap <String, Integer> companyMap = new HashMap <String, Integer>();
		
		companyMap.put("Google", 10000);
		companyMap.put("Walmart", 20000);
		companyMap.put("Amazon", 30000);
		companyMap.put("Facebook", 40000);
		companyMap.put("Cisco", 50000);
		
		/*We would store -->
		 * Keys = In ArrayList 01
		 * Values = In ArrayList 02
		 */
		
		System.out.println("companyMap size : " + companyMap.size());
		
		Iterator it = companyMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			
			System.out.println(pairs.getKey() + "=" + pairs.getValue());
			
			//Convert HashMap Keys to ArrayList -->
			
			List <String> companyName = new ArrayList<String>(companyMap.keySet());
			
			for(String t : companyName) {
				System.out.println(t);
			}
			
			//Convert HashMap Values to ArrayList -->
			
			List <Integer> empValue = new ArrayList<Integer>(companyMap.values());
			
			for(Integer e : empValue) {
				System.out.println(e);
			}
			
			//To print all values from HashMap - 
			//1. We use Iterator
			//2. Lambda expression
			
			companyMap.forEach((K,V) -> System.out.println("Key = " +K + " Value = " +V));
			
		}

	}

}
