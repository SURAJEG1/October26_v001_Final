package javaPrograms;

import org.testng.annotations.Test;

public class ReverseEachWord {
	
	
	@Test
	public void reverseEachEveryWordInSentence() 
	{
		String str = "How are you";
		String result = "";
		
		String[] array = str.split("\\s");
		
		for(String word:array) 
		{
			//some operation --> write the logic to reverse a string.
			//how
			
			String reverseWord = "";
			int j = word.length()-1;
			
			while(j>=0) 
			{
				char ch = word.charAt(j);
				reverseWord = reverseWord + ch;
				j--;
			}
			result = result + reverseWord + " ";
		}
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
