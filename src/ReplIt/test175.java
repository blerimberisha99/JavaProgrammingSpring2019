package ReplIt;

import java.util.*;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class test175 {
	public static String lameDb(String db, String op,String id,String data)
	  {
		int ab = db.indexOf(id);
	    int a = db.indexOf(id)+1;
	    int b = db.indexOf("#",db.indexOf(id)+2);
	    int c = db.indexOf("#",db.indexOf(id)+1);
	    switch(op)
	    {
	      case "add":
	        db = db + "#" + id + data;
	        break;
	      case "edit":
	    	if(ab < 0)
	    		break;
	        if(b>=0)
	        {
	        db = db.replace(db.substring(a, b), data);
	        }
	        else
	        {
	        	db = db.replace(db.substring(a, db.length()), data);
	        }
	        break;
	      case "delete":
	    	  if(ab < 0)
		    		break;
	        if(c>=0)
	        {
	        db = db.replace(db.substring((a-1), c), "");
	        }
	        else
	        {
	        	db = db.replace(db.substring((a-1), db.length()), "");
	        }
	        break;
	      default:
	        break;
	    }
	    return db;
	  }//end lameDb
	  
	  
	   public static void main(String[] args) throws IOException 
	   {
	    
	     String[] idk = {"you","are","a","good person"};
	     System.out.println(Arrays.toString(idk));
	     
	     String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	     System.out.println("Data size : " + data.length);
	     
	   
	     
	     System.out.println(data[0]);
	     System.out.println(data[1]);
	     System.out.println(data[data.length-1]);
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","edit","1","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","ccc")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","3","bbb")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }


	}