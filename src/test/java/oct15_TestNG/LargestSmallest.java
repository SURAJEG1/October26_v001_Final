package oct15_TestNG;

public class LargestSmallest {
	
	
	public static void main(String[] args) 
	{
		int[] array = {12, 5, 78, 3, 35,99, 1};
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
		
		System.out.println("Largest :" + largest);
		System.out.println("Smallest :" + smallest);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
