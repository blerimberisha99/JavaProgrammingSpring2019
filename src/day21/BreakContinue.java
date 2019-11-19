package day21;


public class BreakContinue {

	public static void main(String[] args) {
		
		int i =0;
		for(i = 1; i <=50 ; i++)
		{
//			if(i%5!=0)
//			
//			 Or
			 if(i%5==0)
			 {
			 if(i%20==0)
			 break;
			 continue;
			 }
			System.out.print(i + " ");
		}
	}
}
