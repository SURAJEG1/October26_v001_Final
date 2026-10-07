package javaPrograms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HowToFindDuplicateCharacter {

	
	@Test
	public void duplicateCharater() 
	{
		String str = "automation";
		
		char[] array = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;
		
		for(int i=0; i<array.length; i++) 
		{
			if(!map.containsKey(array[i])) 
			{
				map.put(array[i], count);
			}
			else 
			{
				map.put(array[i], map.get(array[i])+1);
			}
		}
		
		for(Character key:map.keySet()) 
		{
			if(map.get(key)>1) 
			{
				System.out.println(key + " : " + map.get(key));
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
