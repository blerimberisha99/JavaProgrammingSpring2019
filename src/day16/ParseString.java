package day16;

public class ParseString {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String codeCount = "I have written [123] lines of code";
		
		System.out.println("Lines of code written: " + codeCount.substring(codeCount.indexOf("[") + 1, codeCount.indexOf("]")));
		
		String codeCount1 = codeCount.substring(codeCount.indexOf("[") + 1, codeCount.indexOf("]"));
		int count = Integer.parseInt(codeCount1);
		System.out.println("Parsed number = " + count);
		
		String codeReplace = codeCount.replace(" ", "");
		System.out.println(codeReplace);
		
		int num = 0;
		while(num < 5)
		{
			System.out.println("this is not ok + " + num);
			++num;
		}
		
		int i = 0;
	    
	    while(i<=100)
	    {
	      System.out.println(i);
	      i++;
	      Thread.sleep(100);
	    }
		

	}

}
