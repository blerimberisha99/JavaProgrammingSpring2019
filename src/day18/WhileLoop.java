package day18;

import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secretPin = 4321;
		
		int pincode = 0, attempts = 0;
		
		while(pincode != secretPin)
		{
			System.out.println("Enter pincode:");
			pincode = scan.nextInt();
			if(pincode != secretPin)
				attempts++;
			if(attempts == 3)
			{
				System.out.println("You entered it 3 times wrong, card blocked");
				return;
			}
		}
		System.out.println("urrra ja ki dal");
		
	}
}
