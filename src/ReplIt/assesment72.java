package ReplIt;

public class assesment72 {
	public static void main(String[] args) 
	{
		String[] arr = {"hey","yolo","hi", "gg","ggg" ,"this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	public static String minVowels(String[] words)
	{
	  int idx = 0;
	  
	  String shortest;
//	  int maxima = Integer.MAX_VALUE;
//	  for(int i = 0; i < words.length ; i++ )
//		{
//		  if(maxima >= countVowels(words[i]))
//		  {
//		    if(maxima == countVowels(words[i]))
//		    {
//		      if(words[idx].length()>words[i].length())
//		      {
//		        idx = i;
//		      }
//		      else
//		      continue;
//		      
//		    }
//		    maxima = countVowels(words[i]);
//		    idx = i;
//		  }
	  int minValue = Integer.MAX_VALUE;
	  for(int i = 0; i < words.length ; i++)
		{
			if(minValue >= countVowels(words[i]))
			{
				if(words[idx].length() >= words[i].length())
				{
					minValue = countVowels(words[i]);
					idx = i;
				}
			}
		}
	  //String al = " ";
	  //al.endsWith(suffix)
		  
		
		return words[idx];
	}
	public static int countVowels(String s)
	{
	  int vowels = 0;
	  
		for(int i = 0; i<s.length() ; i++)
		{
		  if(isVowel(s.charAt(i)))
		  vowels++;
		}
		return vowels;
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u';
	}
}