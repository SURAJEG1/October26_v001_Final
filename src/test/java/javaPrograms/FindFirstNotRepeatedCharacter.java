package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class FindFirstNotRepeatedCharacter {
	
	
	@Test
	public void firstNotRepeatedCharater() 
	{
		String str = "swiss";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;
		
		for(int i=0; i<str.length(); i++) 
		{
			if(!map.containsKey(str.charAt(i))) 
			{
				map.put(str.charAt(i), count);
			}
			else
			{
				map.put(str.charAt(i), map.get(str.charAt(i))-1);
			}
		}
		
		//printing the first non-repeated character from map
		
		for(Entry<Character, Integer> entry:map.entrySet()) 
		{
			if(entry.getValue()==1)
			{
				System.out.println("The first non replacted character is : " + entry.getKey());
				break;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
