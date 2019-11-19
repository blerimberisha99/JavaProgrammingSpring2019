package day07;

import java.util.Scanner;



public class ScannerClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
	
		System.out.println("Enter 3 numbers : ");
		num1 = scan.nextInt();
	//	System.out.println("");
		num2 = scan.nextInt();
	//	System.out.println("");
		num3 = scan.nextInt();
	//	System.out.println("");
		char a = scan.next().toUpperCase().charAt(0);
		
		int sum = num1 + num3 + num2;
		
		System.out.println("The sum of the 3 numbers you wrote is : " + (-sum) +" " + a + "\n");
		
		double count = 126.6;
		
		int count1 = (byte)count;
		
		char pol = 'a';
		
		
		System.out.println('a' + count1);
		
		
		
		
	}
}
