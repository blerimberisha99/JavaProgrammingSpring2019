package day09;

import java.util.*; 

public class StringSomething {
public static void main(String[] args) {

	String str1 = "java";
	String str2 = "java";
	
	System.out.println(str1 == str2);
	System.out.println(str1 == "java");
	System.out.println(str2 == "Java");
	
	
	System.out.println(str1.equals(str2));
	System.out.println(str2.equals("java"));
	System.out.println(str1.equals("Java"));
	
	String str3 = new String("Java");
	String str4 = new String("Java");
	System.out.println(str3.equals("Java"));
	
	System.out.println(str3 == str4); // FALSE, IT does not compare characters but  it checks if str3 and str4 are pointing to the same location in memory
	
	System.out.println(str3.equals(str4)); // TRUE
	
	
	
	
}	
}
