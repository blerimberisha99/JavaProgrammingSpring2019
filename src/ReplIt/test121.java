package ReplIt;
import java.util.*;
public class test121 {

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);  
		    String str = scan.nextLine();
		    
		    String[] arr = str.split(", ");
		    int minLen = arr[0].length();
		    String min = "";
		   // int j = 0;
		    for(int i = 0; i<arr.length; i++)
		    {
		      if(arr[i].length()<=minLen)
		      {
		    	  if(arr[i].length()==minLen)
		    		  min = min + arr[i] + ", ";
		    	  else
		    	  {
		    		  min = arr[i] + ", ";
		    		  minLen = arr[i].length();
		    	  }
		      }
		      
		      
		    }
		    if(min.endsWith(", "))
		    	min = min.substring(0, min.length()-2);
		    String[] arr2 = min.split(", ");
		    Arrays.sort(arr2);
		    System.out.println(Arrays.toString(arr2));
		    
		  }
		}