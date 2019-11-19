package ReplIt;
import java.util.*;
public class Assesment62 {
	public static void main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		System.out.println(isMagic(d)); //true
	}
	public static boolean isMagic(int[][] array)
	{
		boolean rezultati = false;
		int a = array.length;
		int b = array[0].length;
		int[] w = Arrays.copyOf(array[0], array[0].length);
		int[] r = Arrays.copyOf(array[0], array[0].length);
		int[] t = new int[2];
		int q = 0, e = 0, y = 0, u = 0;
		if(a == b)
		{
		  for(int i = 0; i < a; i++)
		  {
		    for(int j = 0; j < a; j++)
		    {
		      q = q + array[i][j];
		    }
		    w[i] = q;
		    q=0;
		    if(i>=1 && w[i]!=w[i-1])
		    {
		    rezultati = false;
		    return rezultati;
		    }
		  }
		  for(int i = 0; i < a; i++)
		  {
		    for(int j = 0; j < a; j++)
		    {
		      e = e + array[j][i];
		    }
		    r[i] = e;
		    e=0;
		    if(i>=1 && r[i]!=r[i-1])
		    {
			    rezultati = false;
			    return rezultati;
			}
		  }
		  int j = 0;
		 for(int i = 0; i < a; i++)
		  {
		    for(int ja = 0; ja < a; ja++)
		    {
		      if(j<a)
			    {
		    	  y = y + array[j][i];
		    	  j++;
		    	  break;
			    }
		    }
		    
		  }
		  t[0] = y;
		  y=0;
		  j = 0;
		  for(int i = a-1; i >= 0; i--)
		  {
		    for(int ja = 0; ja < a; ja++)
		    {
		      if(j<4)
			    {
		    	  u = u + array[i][j];
		    	  j++;
		    	  break;
			    }
		      
		    }
		    
		  }
		  t[1] = u;
		  u=0;
		  if(t[0] == t[1] && t[0]==w[0] && w[0] == r[0] )
		  {
			    rezultati = true;
			
		  }
		  
		  
		  
		  
		  
		}
		else
		rezultati = false;
		return rezultati;
	}
}