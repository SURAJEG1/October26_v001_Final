package javaPrograms;

import org.testng.annotations.Test;

public class HowToCountCharacterOccurrence {
	
	
	@Test
	public void duplicateCharacter() 
	{
		String str = "Java is object oriented language";
		
		
		int result = str.length()-str.replaceAll("a", "").length();
		System.out.println(result);
	}
	
	@Test
	public void duplicateCharacterExample2() 
	{
		String str = "Java is object oriented language";
		int totalCount = str.length();
		int totalCount_AfterRemove = str.replace("a", "").length();
		int count = totalCount-totalCount_AfterRemove;
		
		System.out.println(count);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
