package day26;

import java.util.*;

public class ArrayExercises {

	public static void main(String[] args) {
		
		String[] Names = {"Hasan","Kadri","Ilmi","Gjevrush","Xhemajl","Kemal","Idriz","Bedri","Vehbi","Nexhmedin","Shyqeri"};
	
		System.out.println("This Array has " + Names.length + " names on it ahhahah");
		
		String emrat = Arrays.toString(Names);
		emrat = emrat.substring(1, emrat.length()-1);
		System.out.println(emrat);
		int i = 0;
		for(i=0; i<Names.length; i = i+2)
		{
			if(Names.length%2 == 0)
			System.out.println(Names[i] + ", " + Names[i+1]);
			else
			{
				if(i == (Names.length-1))
					System.out.println(Names[i]);
				else
					System.out.println(Names[i] + ", " + Names[i+1]);
			}
		}
		
		
		Random random = new Random();
		int r = random.nextInt(17);
		System.out.println(r);
		
		for(String nname : Names)
		{
			if(nname.length()>5)
				System.out.println(nname);
		}
		System.out.println("Emrat e perveqshem apo secilit: ");
		String[] secili = emrat.split(", ");
		for(String selici : secili)
		{
				System.out.println(selici);
		}
		
		String word = secili[9];
		char[] shkronjat = word.toCharArray();
		System.out.println("Shkronja e 3 e NExhit o " + shkronjat[2]);
	
	}

}
