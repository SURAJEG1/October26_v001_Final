package oct05_TestNG;

import org.testng.annotations.Test;

public class RegistrationTestCase extends BaseClass{
	
	
	@Test
	public void doRegistration() 
	{
		driver.get(baseUrl);
		maximize();
		pageScrollDown();
		windowsHandles();
		explicitWait();
		fluentWait();
		tearDown();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
