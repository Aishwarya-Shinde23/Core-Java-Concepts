package Java_Basics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*ARRAY :
		 * SYNTAX - 1 Dimensional Array
		 * int i[] = new int [n] OR int []i = new int [n] & n = size of array
		 * 1D Array is a STATIC ARRAY [size cannot be changed once declared] & allows to store multiple values of similar datatype.
		 * We can define Integer, Double, Boolean, Char, String array as well
		 */
		
		//INTEGER ARRAY - 
		int i[] = new int [4]; //Size of array = 4
		i[0] = 1;	//0th index
		i[1] = 3;	//1st index
		i[2] = 5;	//2nd index
		i[3] = 7;	//3rd index
		System.out.println(i[2]); 
		
		//DOUBLE ARRAY - 
		double d[] = new double [3];
		d[0] = 12.33;
		d[1] = 16.99;
		d[2] = 18.06;
		System.out.println(d[0]);
		
		//CHAR ARRAY - 
		char c[] = new char [2];
		c[0] = 'a';
		c[1] = 'b';
		System.out.println(c[1]);
		
		//BOOLEAN ARRAY - 
		boolean b[] = new boolean [2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		
		//STRING ARRAY - String is not a datatype it's a class.
		String s[] = new String [3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "Selenium";
		System.out.println(s[2]);
		System.out.println(s.length);	//s.length = To print size of array
	
	}

}
