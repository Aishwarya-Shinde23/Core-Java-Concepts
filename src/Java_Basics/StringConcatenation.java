package Java_Basics;

public class StringConcatenation {

	public static void main(String[] args) {
						
				/*POINTS TO KNOW: - 
				 * '+' --> Concatenation Operator
				 * When we add a combination of characters and digits, it will be executed as - 
				 * String 1 = x+y --> HelloWorld
				 * String 2 = String 1+a --> HelloWorld100
				 * String 3 = String 2+b --> HelloWorld100200
				 */
				
				int a = 100;
				int b = 200;
				
				String x = "Hello";
				String y = "World";
				
				System.out.println(a+b); //300
				
				System.out.println(x+y); //HelloWorld
				
				System.out.println(a+b+x+y); //(100+200+Hello+World --> 300HelloWorld)
				
				System.out.println(x+y+a+b); //(Hello+World+100+200 --> HelloWorld100200)
				
				System.out.println(x+y+(a+b)); //(Hello+World+(100+200)) --> HelloWorld300)
				
				System.out.println(a+b+x+y+a+x+b+y); //(100+200+Hello+World+100+Hello+200+World --> 300HelloWorld100Hello200World)
				
				System.out.println(a+b+x+y+a+b); //(100+200+Hello+World+100+200 --> 300HelloWorld100200)
				
		}

}
