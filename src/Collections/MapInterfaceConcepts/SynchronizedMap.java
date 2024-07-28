package Collections.MapInterfaceConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {

	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "A");
		map1.put("2", "B");
		map1.put("3", "C");
		
		//Convert above HashMap to Synchronised HashMap - 
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
				
	}

}
