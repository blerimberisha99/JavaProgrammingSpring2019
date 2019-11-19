package day21;

import java.util.*;

public class test1 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in); 
	int a = 0, b = 0;
	
	System.out.println("Enter two numbers:");
	a = scan.nextInt();
	b= scan.nextInt();
	
	while((a+b)<100)
	{
		System.out.println("Enter two numbers:");
		a = scan.nextInt();
		b= scan.nextInt();
	}
	System.out.println("Good numbers");
	
}
}
