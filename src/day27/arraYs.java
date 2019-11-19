package day27;

import java.util.Arrays;

public class arraYs {

	public static void main(String[] args) {
		
		double[] d1 = {23.4 , 33.4 , 332.2};
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 50.5;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		double[] d3 = Arrays.copyOf(d2, 2);
		System.out.println(Arrays.toString(d3));
	

	}

}
