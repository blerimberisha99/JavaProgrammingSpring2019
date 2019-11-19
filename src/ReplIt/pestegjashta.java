package ReplIt;

import java.util.*;

public class pestegjashta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    
		 Scanner scan = new Scanner(System.in);
		    int inhabitants = scan.nextInt();
		    int i = 0;
		    int half = inhabitants;
		    for(i = 0; i<=inhabitants ; i++)
		    {
		    	if(half==1)
				      break;
		      System.out.println("Day " + i + " [" + half + "]");
		      half = half/2;
		      
		    }
		    System.out.println("---- EXTINCT ----");
		    
		    
		  }
		}