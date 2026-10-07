package javaPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AnagramString {
	
	
	@Test
	public void anagramString() 
	{
		String str1 = "army";  //stop, tops
		String str2 = "mary";
		
		char[] array1 = str1.toLowerCase().toCharArray();
		char[] array2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)) 
		{
			System.out.println("Given strings are anagram");
		}
		else
		{
			System.out.println("Given strings are NOT anagram");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
