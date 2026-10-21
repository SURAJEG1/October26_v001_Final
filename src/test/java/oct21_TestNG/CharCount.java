package oct21_TestNG;

import java.util.HashMap;

public class CharCount {
	
	
	
	
	public static void main(String[] args) 
	{
		String str = "automatin";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char C : str.toCharArray()) 
		{
			map.put(C,  map.getOrDefault(C, 0)+1);
		}
		
		System.out.println("Character occurrences : " + map);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
