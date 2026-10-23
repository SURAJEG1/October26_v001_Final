package oct23_TestNG;

import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	
	
	@Test
	public void searchProd() 
	{
		driver.get(baseUrl);
		windowHandles();
		pageScrollDown();
		explicitWait();
		fluentWait();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
