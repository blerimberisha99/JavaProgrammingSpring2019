package day24;

import java.util.*;

public class toCharArray {

	public static void main(String[] args) {
		
		String str = "aAw Ju aRe sO kJut";
		int i=0;
		String shkronjat1 = "", sdf = "";
		char[] chars = str.toCharArray();
		
		for(char shkronjat : chars)
		{
			System.out.println(shkronjat);
		}
		
		for(char shkronjat : chars)
		{
			shkronjat1 =  shkronjat1 + "" + shkronjat;
			
		}
		sdf = chars.toString();
		System.out.println(shkronjat1);
		System.out.println(sdf);
		
		
		String sentence = "kola loka sola halala tralala";
		String[] words = sentence.split(" ");
		for(String qwe : words)
		{
			System.out.println(qwe);
		}
		
		System.out.println(Arrays.toString(chars));
		
		
	}

}
