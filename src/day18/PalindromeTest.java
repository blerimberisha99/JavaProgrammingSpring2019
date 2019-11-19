package day18;

import java.util.*;



public class PalindromeTest {
	public static void main(String[] args) {
		
		String word1, word2 = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word1: ");
		word1 = scan.nextLine();
		
//		System.out.println("Enter word2: ");
//		word2 = scan.nextLine();
//		
		//String space = "";
		
		//while()
		int ind = word1.length() - 1;
		while(ind >= 0)
		{
			word2 = word2 + word1.charAt(ind);
			ind--;
		}
		
		if(word1.equals(word2))
			System.out.println("The word you entered is a palindrome");
		else
			System.out.println("The word you entered is NOT a palindrome");
			
		System.out.println("The reversed of your word is " + word2);
		//int word3 = word1.index
			
		
	}

}
