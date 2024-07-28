package Collections.MapInterfaceConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Nick");
		map.put(1400, "Rob");
		
		System.out.println(map); //Output in sorted order
		
		map.forEach((K,V) -> System.out.println("Key = " + K + " Value = " +V));
		
		//Print only those records (keys) having salary less than 3000
		
		System.out.println(map.firstKey());
		
		System.out.println(map.lastKey());
		
		Set<Integer> keysLessThan3K = map.headMap(3000).keySet();
		
		System.out.println(keysLessThan3K);
		
		Set<Integer> keysGreaterThan3K = map.tailMap(3000).keySet();
		
		System.out.println(keysGreaterThan3K);
		
		//To print TreeMap in reverse order -->
		
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(Comparator.reverseOrder());
		map1.put(100, "J");
		map1.put(200, "B");
		map1.put(400, "A");
		map1.put(50, "G");
		map1.put(900, "L");
		map1.put(120, "T");
		map1.put(300, "P");
		
		System.out.println(map1);
		
	}

}
