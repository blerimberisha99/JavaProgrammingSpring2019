package day30;
import java.util.*;
public class rangeMethod {

	public static void main(String[] args) {
		System.out.println(reti());
		int i = reti();
		
		System.out.println("i : " + i );
		reti();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int nul1 = scan.nextInt();
		int nul2 = scan.nextInt();
		
		rangePrint(nul1, nul2);

	}
	
	public static void rangePrint(int num1, int num2) {
		int a = num1-num2;
		int b = num2 - num1;
		int alfa = num1;
		int beta = num2;
		if(num1>=num2)
		{
			for(int i = 0; i<=(a); i++)
			{
				
				System.out.println(alfa);
				alfa--;
			}
		}
		
		if(num2>num1)
		{
			for(int i = 0; i<=(b); i++)
			{
				System.out.println(alfa);
				alfa++;
			}
		}
		
		
	}
	public static int reti() {
		System.out.println("Dumb bitch");
		return 20;
	}

}
