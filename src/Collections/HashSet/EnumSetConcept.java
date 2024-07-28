package Collections.HashSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {
	
	//Create ENUM - 
	enum lang {
		JAVA,
		CSHARP, 
		JAVASCRIPT, 
		PYTHON,
		RUBY
	}
	
	public static void main(String[] args) {
		
		EnumSet<lang> lang1 = EnumSet.allOf(lang.class); //To print all values
		
		System.out.println(lang1);
		
		EnumSet<lang> lang2 = EnumSet.noneOf(lang.class); //To createempty Enum
		
		System.out.println(lang2);
		
		EnumSet<lang> range = EnumSet.range(lang.JAVA, lang.PYTHON); //Prints values within the range
		
		System.out.println(range);
		
		EnumSet<lang> JavaEnum = EnumSet.of(lang.JAVA); //To print single value
		
		System.out.println(JavaEnum);
		
		EnumSet<lang> multipleEnum = EnumSet.of(lang.RUBY, lang.PYTHON); //To print single value
		
		System.out.println(multipleEnum);
		
		//add, addAll - 
		lang2.add(lang.JAVASCRIPT);
		
		lang2.addAll(lang1);
		
		System.out.println(lang2);
		
		//To iterate EnumSet - 
		EnumSet<lang> all_lang = EnumSet.allOf(lang.class);
		Iterator<lang> it = all_lang.iterator();
		while(it.hasNext()) {
			//System.out.print(it.next()); //Prints output in the form of [Java, Csharp, Javascript, Python, Ruby]
			//System.out.print(",");
			//OR
			System.out.println(it.next());
		}
		
		//remove, removeAll - Output is boolean
		EnumSet<lang> newlang = EnumSet.allOf(lang.class);
		System.out.println(newlang);
		
		Boolean b = newlang.remove(lang.JAVA);
		System.out.println(b);
		
		Boolean b1 = newlang.removeAll(newlang);
		System.out.println(b1);
		System.out.println(newlang);
		
	}
}
