package ReplIt;
import java.util.*;
public class test113 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    Arrays.sort(nums);
	    int a = Arrays.binarySearch(nums, 3);
	    System.out.println(a);
	    int ndp = 0;
	    for(int i = 0; i< nums.length ; i++ )
	    {
	      if(nums[i] == nums[i+1])
	      i=i+1;
	      else
	      {
	        ndp = nums[i];
	        break;
	      }
	    }
	    
	    System.out.print(ndp);
	    
	    
	    
	    
	  }
	}