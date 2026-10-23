package oct22_TestNG;

public class LarestAndSmallest {
	
	
	public static void main(String[] args) 
	{
		int[] array = {12, 5, 78, 3, 45, 99, 1};
		
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
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
