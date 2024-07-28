package Collections.Vector;

import java.util.Vector;

public class TwoDimensionalVector {

	public static void main(String[] args) {
		
		/*How to create 2D Vector -->
		 * Create Vector1 and add values 
		 * Create Vector2
		 * Add Vector1 to Vector2
		 * Iterate using FOR Loop
		 * Cast to type(Vector) & generic defined for Vector1
		 * Using get() fetch every value of vector
		 */
		Vector <String> langVector = new Vector <String>();
		langVector.add("Java");
		langVector.add("Ruby");
		langVector.add("Python");
		langVector.add("JS");
		langVector.add("C#");
		
		Vector osVector = new Vector();
		
		//This means we have langVector ar 0th position in osVector created
		osVector.add(langVector);
				
		//osVector.get(0)).get(i) --> Traverse langVector by calling 0th index of osVector and get(i) to traverse through each element
		for(int i=0; i<langVector.size(); i++) {
			String str = (String)((Vector)osVector.get(0)).get(i);
			System.out.println(str);
		}
		
	}

}
