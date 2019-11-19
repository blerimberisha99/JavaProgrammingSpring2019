package ReplIt;
import java.util.*;
public class Test119 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int k = 0;
			double total = 0;
			double avgTemp = 0;
			
			double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
					scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
			k = temps.length;		
			for(double lotal : temps)
			{
				total = total + lotal;
			}
			total = total/k;
			System.out.println(total);
	  }
	}