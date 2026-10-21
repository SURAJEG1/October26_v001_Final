package oct16_TestNG;

import java.util.HashMap;

public class CharactrerCount {
	
	
	public static void  main(String[] args)
	{
		String str = "automation";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char C : str.toCharArray()) 
		{
			map.put(C, map.getOrDefault(C,0) + 1);
		}
		
		System.out.println("Character Occurrences : " + map);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
