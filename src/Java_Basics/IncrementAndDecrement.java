package Java_Basics;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		/*POST - INCREMENT :
		 * '++' --> Increment Operator
		 * Initial value of i is assigned to j i.e., j =1
		 * Then i is incremented by 1 i,e., i = 2 and this value is assigned to i
		 */
		  		
		int i =1;
		int j = i++;
		System.out.println(i); //2
		System.out.println(j); //1
		
		/*PRE - INCREMENT :
		 * '++' --> Increment Operator
		 * Increment k by 1 first i.e., 2+1 = 3
		 * Then assign the incremented value to l = 3
		 */
		
		int k =2;
		int l = ++k;
		System.out.println(k); //3
		System.out.println(l); //3
		
		/*POST - DECREMENT :
		 * '--' --> Decrement Operator		 
		 * Initial value of m is assigned to n i.e., n=2
		 * Then i is decremented by 1 i,e., m = 1 and this value is assigned to m
		 */
		
		int m = 2;
		int n = m--;
		System.out.println(m); //1
		System.out.println(n); //2
		
		/*PRE - DECREMENT :
		 * '--' --> Increment Operator
		 * Decrement p by 1 first i.e., 5-1=4
		 * Then assign the decremented value to q = 4
		 */
				
		int p =5;
		int q = --p;
		System.out.println(p); //4
		System.out.println(q); //4

	}

}
