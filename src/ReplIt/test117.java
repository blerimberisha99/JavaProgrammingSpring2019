package ReplIt;
import java.util.*;
public class test117 {

	
		public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  
		  
		  public static String[] getWithE(String[] arr) {
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
		    String lesValues = "";
		    for(String arw : arr)
		    {
		      if(arw.contains("e"))
		      {
		        lesValues = lesValues + arw + " ";
		      }
		    }
		    lesValues = lesValues.trim();
		    String[] fewValues = lesValues.split(" ");
		    
		    
		    
		    //YOUR CODE ENDS HERE -----------------------
		    
		    return fewValues;
		  }
		  
		  
		  
		}