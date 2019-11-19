package day04;

import java.util.Scanner;

public class UsingVariables {

	public static void main(String[] args) {
		
		Scanner kola = new Scanner(System.in);
		
		int minutes;
		int remainingMinutes;
		int hours;
		
		System.out.print("Write a number : ");
		boolean werty = kola.nextBoolean();
		//System.out.print(" minutes");
		//minutes = werty;
		minutes = 156;
		
		hours = minutes/60;
		remainingMinutes = minutes%60;
		
		
		
		System.out.println("The number you wrote in minutes is equal to " + hours + " hour/s and " + remainingMinutes + " minute/s and is " + werty);
		
	}
}
