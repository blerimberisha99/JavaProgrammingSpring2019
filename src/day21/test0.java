package day21;

import java.util.*;

public class test0 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = "", word1 = "";
	int i = 0;
	System.out.println("Enter Word:");
	word = scan.nextLine();
	
	for(i = 1; i <= word.length()-1; i++)
	{
		int a = word.indexOf(word.charAt(i), i);
		int b = word.indexOf(word.charAt(i));
		if(a != b)
		{
			word = word.substring(0,i) + word.substring(i+1);
			i = i-1;
		}
	}
	System.out.println(word);
	
	
	//Method 2
	
	System.out.println("Enter Word:");
	word = scan.nextLine();
	
	for (i=1; i<word.length(); i++)
	{
		if(!word1.contains(""+word.charAt(i)))
			word1 = word1 + word.charAt(i);
	}
	System.out.println(word1);
}
}
