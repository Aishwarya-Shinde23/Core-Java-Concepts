package Java_Basics;

public class WrapperClass {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+20); //10020 as it is string and not integer
		
		/* WRAPPER CLASS - 
		 * It is used when data conversion is needed i.e., conver one Datatype to another.
		 * INTEGER, DOUBLE, BOOLEAN, STRING are Wrapper classes.
		 * For INTEGER, DOUBLE, BOOLEAN use method [Datatype. parse()].
		 * For String use method [Datatype.valueOf()].
		 */
		
		//Data conversion - String to integer
		int i = Integer.parseInt(s);
		System.out.println(i+20); //120
		
		//Data conversion - String to double
		String s1 = "12.33";
		double d = Double.parseDouble(s1);
		System.out.println(d+10); //22.33
		
		//Data conversion - String to boolean
		String s2 = "true";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b); //true
		
		//Data conversion - Integer to String
		int j = 100;
		String k = String.valueOf(j);
		System.out.println(k+100); //100100
		
		//NumberFormatException --> String to Integer
		String u = "100A";
		Integer.parseInt(u); //Throws Exception : NumberFormatException : For input string: "100A" as this is not a String value
		
	}

}
