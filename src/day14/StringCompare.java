package day14;

import java.util.*;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word1, word2;
		
		System.out.println("Enter word1:");
		word1 = scan.nextLine();
		System.out.println("Enter word2:");
		word2 = scan.nextLine();
		
		if(word1.length()>word2.length())
			System.out.println("word1 : \"" + word1 + "\" is longer");
		else if(word1.length() == word2.length())
			System.out.println("word1 : \"" + word1 + "\" and word2 : \"" + word2 + "\" are the same length");
		else
			System.out.println("word2 : \"" + word2 + "\" is longer");
		
		System.out.println(word1.toLowerCase());
		System.out.println(word2.toUpperCase());
		if(word1.toUpperCase().equals("OPAT"))
			System.out.println("Urrrrrrrrraaaaaaaa");
		System.out.println(word2.length());
		
		
		
		String userName;
		System.out.println("Enter username:");
		userName = scan.nextLine();
		// userName = "adsfdasd";
		if(userName.length() == 8)
		{
			System.out.println("Good userName");
			System.out.println(userName.charAt(0));
			System.out.println(userName.charAt(1));
			System.out.println(userName.charAt(2));
			System.out.println(userName.charAt(3));
			System.out.println(userName.charAt(4));
			System.out.println(userName.charAt(5));
			System.out.println(userName.charAt(6));
			System.out.println(userName.charAt(7));
			
		}
		else
			System.out.println("Your username must have only 8 characters");
		
		if(userName.startsWith("aqw"))
			System.out.println(userName + " starts with aqw");
		if(userName.endsWith("asd"))
			System.out.println(userName + " ends with asd");
		if(userName.contains("as"))
			System.out.println(userName + " contains as ");
		
		char a = userName.charAt( userName.length()-1 );
		System.out.println(a);
		
		System.out.println(userName.indexOf("l"));
		System.out.println(userName.indexOf("sfd"));
		System.out.println(userName.indexOf("a",1));
		System.out.println(userName.substring(0,3));
		
		
		
		

	}

}
