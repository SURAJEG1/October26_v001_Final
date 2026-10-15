package oct15_TestNG;

public class FibonacciSeries {
	

	
	public static void main(String[] args) 
	{
		int n = 0, first = 0, second = 1;
		
		System.out.println("Fibonacci Series: " + first + " " + second);
		
		for(int i=2; i<n; i++) 
		{
			int next = first + second;
			System.out.println(" " + next);
			first = second;
			second = next;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
