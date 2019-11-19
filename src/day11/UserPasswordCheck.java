package day11;

import java.util.*;

public class UserPasswordCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		boolean aq, bq, cq, dq;
		
		//aq = cq = true;
		//bq = false;
		
		dq = true;
		
		//dq = aq || bq && cq;
		System.out.println(!!!dq);
		
		String username;
		String password;
		
		System.out.println("Enter username:");
		username = scan.next();
		System.out.println("Enter password:");
		password = scan.next();
		
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword))
			System.out.println("Login Successful, Welcome!");
		else if (!username.equalsIgnoreCase(validUsername)  && !password.equals(validPassword))
			System.out.println("Invalid Username and Invalid Password");
		else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword))
			System.out.println("Invalid Password");
		else if (!username.equals(validUsername) && password.equals(validPassword))
		System.out.println("Invalid Username");

	}

}
