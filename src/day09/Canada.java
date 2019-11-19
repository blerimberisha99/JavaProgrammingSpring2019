package day09;

import java.util.*;

public class Canada {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String capital, capital1;
		
		System.out.println("What is the Capital of Canada:");
		capital = scan.nextLine();
		capital1 = capital;
		System.out.println(capital == "Ottawa");
		if(capital1 == "Ottawa")
		{
			System.out.println("You are correct, Ottawa is the capital of Canada");
		}
		else if (capital == "Ottawwa")
		{
			System.out.println("You learn how to write");
		}
//		else if (capital.equals("Ottawa"))
//		{
//			System.out.println("You are stupid but right");
//		}
		else
		{
			System.out.println("Your answer is not correct, " + capital + " is not the capital of Canada, Ottawa is");
		}
		

	}

}
