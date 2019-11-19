package ReplIt;

import java.util.*;

public class Test92 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     
	     
	     String alfa = "";
	     int a = str.indexOf("bread")+5;
	     int b = str.indexOf("bread", a+1) ;
	     if(str.contains("bread") && b > 0)
	     {
	     
	     alfa = str.substring(a, b);
	     System.out.println(alfa);
	     }
	     else
	    	 System.out.println("nothing");
	  }
	}
