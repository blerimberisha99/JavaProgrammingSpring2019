package day13;

import java.util.*;
public class SwitchContinuation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int carType, num = 1234, dig;
		double averagePrice = 0;
		String carOption = "", carState = "";
		
		System.out.println("Which type of car do you want?");
		carType = scan.nextInt();
		 
		switch(carType)
		{
		case 1:
			carState = "American";
			carOption = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			averagePrice = 3300;
			break;
		case 2:
			carState = "Japanese";
			carOption = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			averagePrice = 3200;
			break;
		case 3:
			carState = "German";
			carOption = "Bmw, VW, Audi, Mercedes, Porsche";
			averagePrice = 5500;
			break;
		case 4:
			carState = "Italian";
			carOption = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			averagePrice = 8500;
			break;
		case 5:
			carState = "Korean";
			carOption = "Kia, Hyundai, Daewoo";
			averagePrice = 2500;
			break;
		default:
			System.out.println("Car type not available");
			return;
					
		}
		
		
		
		System.out.println("You selected " + carState + " car and your options are " + carOption + "\nAverage Price: " + averagePrice);
		String result = 10 > 60 ? "You don't suck" : "You suck";
		System.out.println(result);
		System.out.println(result.toUpperCase());
		System.out.println(result.toLowerCase());
		System.out.println(result);
		int a=5;
		System.out.println(a+5);
		System.out.println(a++);
		System.out.println(a);
		
	}
}
