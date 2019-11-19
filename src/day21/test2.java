package day21;

import java.util.*;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String halo = "";
		
		System.out.println("Enter words: ");
		halo = scan.nextLine();
		int i = 0;
		for(i=0; i < halo.length()-1 ; i++)
		{
			System.out.println(halo.substring(i, i+2));
		}
		
	}
}
