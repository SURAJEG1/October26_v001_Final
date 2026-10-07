package oct02_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class FlipkartSearchProduct {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		
	}
	
	
	
	@Test
	public void searchProductEndToEndTesting() 
	{
		WebElement searchBox = driver.findElement(By.xpath(""));
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	public void tearDown() 
	{
		driver.close();
	}
	
	

}
