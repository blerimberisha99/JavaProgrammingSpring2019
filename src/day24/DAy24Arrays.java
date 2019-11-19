package day24;

import java.util.*;

public class DAy24Arrays {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		String[] cities = {"Washington", "Paris", "Berlin" , "Istambul"};
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		int sum = 0;
		
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i<numbers.length ; i++)
		{
			System.out.println(numbers[i]);
		    sum = sum + numbers[i];
		}
		System.out.println("Sum is : " + sum);
		
		int max = Byte.MAX_VALUE;
		System.out.println(max);
		for(int i =0; i< numbers.length ; i++)
		{
			if(numbers[i]<max)
				max = numbers[i];
		}
		
		System.out.println("Minimum num = " + max);
		System.out.println("Citiez length is : " + cities.length);
		for(int i =0; i< cities.length ; i++)
		{
			if(cities[i].charAt(0) == 'P')
				System.out.println(cities[i]);
		}
		for(int i =0; i< cities.length ; i++)
		{
			if(cities[i].startsWith("B"))
				System.out.println(cities[i]);
		}
		for(String city : cities)
		{
			if(city.toUpperCase().startsWith("B"))
				System.out.println(city);
		}
		
	}

}
