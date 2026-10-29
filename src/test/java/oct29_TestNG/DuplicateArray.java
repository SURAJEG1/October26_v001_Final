package oct29_TestNG;

public class DuplicateArray {

	
	public static void main(String[] args) {
		
		int[] array = {4, 5, 6, 7, 4, 6, 8};
		
		System.out.println("Duplicate Number : ");
		
		
		for(int i=0; i<array.length; i++) 
		{
			for(int j=i+1; j<array.length; j++) 
			{
				if(array[i] == array[j]) 
				{
					System.out.println(array[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
