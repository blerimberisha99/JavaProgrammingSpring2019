package ReplIt;
import java.util.*;
public class test102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	    boolean tru = false;
	    for(int i = 0 ; i<nums.length -2 ; i++ )
	    {
	      if(nums[i] == nums[i+1] && nums[i] == 5)
	      {
	      tru = true;
	      break;
	      }
	      else
	      tru = false;
	    }
	    System.out.println(tru);
	    
	    
	    
	  }
	}