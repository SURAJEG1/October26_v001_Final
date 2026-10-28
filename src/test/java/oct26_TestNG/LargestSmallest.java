package oct26_TestNG;

public class LargestSmallest {
	
	
	public static void main(String[] args) {
		
		
		int[] array = {12, 5, 79, 3, 45, 99, 1};
		
		int largest = array[0];
		int smallest = array[0];
		
		for(int num:array) 
		{
			if(num>largest) 
			{
				largest=num;
			}
			
			if(num<smallest) 
			{
				smallest=num;
			}
		}
		
		System.out.println("Largest " + largest);
		System.out.println("Smallest " + smallest);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


