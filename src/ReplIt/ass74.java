package ReplIt;
import java.util.*;
public class ass74 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    int sum = 0;
	    int minVal = Integer.MAX_VALUE;
	    
	    for(int i=0; i<minVal; i++)
	    {
	      System.out.println("Day " + i + Arrays.toString(inhabitants));
	      for(int j=0; j<inhabitants.length; j++)
	      {
	      inhabitants[j] = inhabitants[j]/2;
	      sum = sum + inhabitants[j];
	      }
	      if(sum == 0)
	      {
	        System.out.println("Day " + (i+1) + Arrays.toString(inhabitants));
	        System.out.println("---- EXTINCT ----");
	        return;
	      }
	      else
	    	  sum = 0;
	      
	      
	    }
	    
	    
	  }
	}