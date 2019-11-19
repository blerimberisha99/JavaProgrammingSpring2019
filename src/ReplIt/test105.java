package ReplIt;
import java.util.*;
public class test105 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   

		    //TODO: Write your code below
		    
		    String[] chars = Arrays.copyOf(words, words.length);
		    
		    for(int i = 0; i<words.length ; i++)
		    {
		    	chars[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1);
		    }
		    
		    String finale = Arrays.toString(chars);
		    
		    System.out.println(finale);
		    
		  }
		}