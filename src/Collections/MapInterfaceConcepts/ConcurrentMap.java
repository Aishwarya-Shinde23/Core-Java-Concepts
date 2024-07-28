package Collections.MapInterfaceConcepts;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

	public static void main(String[] args) {

		//Convert above HashMap to ConcurrentHashMap - 
				ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
				concurrentMap.put("A", "JAVA");
				concurrentMap.put("B", "RUBY");
				concurrentMap.put("C", "PYTHON");
				System.out.println(concurrentMap.get("A"));
				System.out.println(concurrentMap);		

	}

}
