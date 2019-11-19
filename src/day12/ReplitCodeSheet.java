package day12;

import java.util.*;

public class ReplitCodeSheet {

	public static void main(String[] args) {
		
		 int itemPrice;
		    int quarters, dimes, nickels;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter price in cents:");
		    itemPrice = scan.nextInt();
		    if(itemPrice > 100 || itemPrice < 25)
		    {
		      System.out.println("Invalid price!");
		    }
		    else if( itemPrice % 5 !=0 )
		    {
		      System.out.println("Invalid price!");
		    }
		    else
		    {
		      quarters = (100 - itemPrice) / 25;
		      dimes = ((100 - itemPrice) - quarters*25) / 10;
		      nickels = (((100 - itemPrice) - quarters*25) - dimes*10) / 5;
		      System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		    }
		  }
		}
		



