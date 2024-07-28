package Java_Basics;

public class ObjectArray {

	public static void main(String[] args) {
		
		/*POINTS TO KNOW: - 
		 * OBJECT ARRAY is a superclass of all classes
		 * To overcome issue to STATIC ARRAY we use OBJECT ARRAY as it allows to store value of different data types
		 */
		
		//OBJECT ARRAY - 
		Object obj[] = new Object[6];
		obj[0] = "Tom";
		obj[1] = 25;
		obj[2] = 12.33;		
		obj[3] = "1/1/1990";
		obj[4] = 'M';
		obj[5] = "London";
		
		System.out.println(obj.length);
		
		System.out.println(obj[3]);
		
		//To print all values of Array - Use FOR Loop
		// If we write i<=obj.length --> We get an exception [java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6]
		
		for(int i = 0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("-------------------------------------------");
		
		//Write a logic to print total no.of rows and columns for [3x5] matrix
		/*2D Array - This array is a matrix format where rows and columns are present
		 * Indexes are based on row number & column number
		 */
		
		String x[][] = new String [3][5];
		
		//String [][]s1 = new String [3][5]; --> Can be written in both ways
		
		System.out.println(x.length); //To show total number of rows
		
		System.out.println(x[0].length); //To show total number of columns we need to point to a row & use .length
		
		//Store values in 2D ARRAY using row & column co-ordinates
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][1]);
		System.out.println(x[2][2]);
		
		System.out.println("-------------------------------------------");
		
		//To print all values of 2D ARRAY - 
		/*We need 2 FOR Loop's - 
		 * 1. OUTER FOR LOOP - This FOR LOOP is for rows
		 * 2. INNER FOR LOOP - This FOR LOOP is for columns and this will be executed first
		 
		 *STEPS - 
		 *Will check for Row = 0 & Column = 0 to 4;
		 * Will check for Row = 1 & Column = 0 to 4;
		 * Will check for Row = 2 & Column = 0 to 4;
		 */
				
		for (int row = 0; row<x.length; row++) { 
			
			for (int col = 0; col<x[0].length; col++) {
				
				System.out.println(x[row][col]);
			}
		}
		
	}

}
