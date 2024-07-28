package Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		Set<String> hs = new HashSet <String>();
		
		//Add value - allows adding duplicate values but ignored while runtime
		hs.add("Alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Testing");
		hs.add(null);
		
		System.out.println(hs); //Does not maintain any order while printing output
		System.out.println(hs.contains("Alpha"));
		
		System.out.println("--------------------------------");
		
		//To Iterate -->
		for(String e : hs) {
			System.out.println(e);
		}
		
		System.out.println("--------------------------------");
		
		//To remove value from Hashset -
		hs.remove("Beta");
		System.out.println(hs);
		
		System.out.println("--------------------------------");
		
		//Iterate using iterator -
		Iterator<String> it =  hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------");
		
		//Mathematical Operations -- UNION
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,3,5,6,0,9}));
		
		Set<Integer> union = new HashSet<Integer>(first);
		
		union.addAll(second);
		
		System.out.println("Union -> " + union);
		
		Set<Integer> intersection = new HashSet<Integer>(first);
		
		intersection.retainAll(second);
		
		System.out.println("Intersection -> " + intersection);
		
		Set<Integer> difference = new HashSet<Integer>(first);
		
		difference.removeAll(second);
		
		System.out.println("Difference -> " + difference);
		
	}
}
