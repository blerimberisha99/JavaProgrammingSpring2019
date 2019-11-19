package day16;

import java.util.*;

public class ExerciseString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String website;
		
		System.out.println("Enter website:");
		website = scan.next();
		
		if(website.startsWith("www"))
			System.out.println("The website starts with wwww");
		else
			System.out.println("It does not start with www");
		
		if(website.charAt( website.length() -4 ) == '.')
			System.out.println("It contains the ending dot right before extension, method 1");
		else
			System.out.println("It does not contain the ending dot right before extension, method 1");
		
		if(website.indexOf(".",4) == (website.length() - 4))
			System.out.println("It contains the ending dot right before extension, method 2");
		else
			System.out.println("It does not contain the ending dot right before extension, method 2");
		
		System.out.println("Domain : " + website.substring(4, website.length() - 4));
		System.out.println("Extension method1 : " + website.substring((website.indexOf(".",4) + 1), website.length()));
		System.out.println("Extension method2 : " + website.substring((website.length() - 3), website.length()));
		
		
		
		
		
	}

	

	
	
	
}
