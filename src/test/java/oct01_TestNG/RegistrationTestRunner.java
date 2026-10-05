package oct01_TestNG;

import org.testng.annotations.Test;

public class RegistrationTestRunner extends BaseClass{

	
	@Test
	public void doRegistration() 
	{
		driver.get(baseUrl);
		windowHandles();
		pageScrollDown();
		explicitWait();
		fluentWait();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
