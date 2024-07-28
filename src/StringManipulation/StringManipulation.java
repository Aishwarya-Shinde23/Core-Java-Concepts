package StringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str1 = "The rains have started here"; //Space in string is also counted as a index
		
		String str2 = "The rains have started here";
		
		String str3 = "The rains Have started Here";
		
		String str4 = "    Hello    World    ";
		
		String str5 = "01-01-2001";
		
		String str6 = "Hello_World_Test_Selenium";
		
		String str7 = "Learning";
		
		//To check length of string
		System.out.println(str1.length());
		
		System.out.println("-------------------------");
		
		//To check character at a certain index
		System.out.println(str1.charAt(5));
		
		System.out.println("-------------------------");
		
		//To check index of 's' present in 'rains' --> called as 1st occurence
		System.out.println(str1.indexOf('s'));
		
		System.out.println("-------------------------");
		
		//To check index for second 's' char present in string --> 2nd occurence
		//System.out.println(str1.indexOf('s', 9)); Hardcoded index value --> NOT RECOMMENDED 
		
		System.out.println(str1.indexOf('s', str1.indexOf('s')+1)); 
		
		System.out.println("-------------------------");
		
		//If value is not present in string, it will return -1
		System.out.println(str1.indexOf("hello"));
		
		System.out.println("-------------------------");
		
		//equals method will compare 2 strings --> will return true/ false
		System.out.println(str1.equals(str2)); 
		
		//OR
		
		System.out.println(str1.compareTo(str2)); // returns 0 if both string are equal
		
		System.out.println("-------------------------");
		
		//Java is case sensitive and will return false
		System.out.println(str2.equals(str3));
		
		System.out.println("-------------------------");
		
		//To ignore case sensitives while comparing 2 strings
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println("-------------------------");
		
		//To print only few words from string we use substring - 
		System.out.println(str1.substring(0, 8));
		
		System.out.println("-------------------------");
		
		//trim() will remove before and after space
		System.out.println(str4.trim());
		
		System.out.println("-------------------------");
		
		//replace() will remove space in between
		System.out.println(str4.replace(" ", ""));
		
		System.out.println("-------------------------");
		
		//replace() will can also be used to replace any value in string
		System.out.println(str5.replace("-", "/"));
		
		System.out.println("-------------------------");
		
		//split() will spilt the string by removing underscores and will always return string array
		//Hence we need to store in Array[] & use for loop to iterate and print
		
		String testval[] = str6.split("_");
		
		for(int i=0; i<testval.length; i++) {
			System.out.println(testval[i]);
		}
		
		System.out.println("---------------------------------------");
		
		//To concat
		System.out.println(str7.concat("_Automation").concat("_Selenium + Java"));
		
	}

}
