package oct08_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class HyperLinkCount {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		
	}
	
	
	
	@Test
	public void hyperLink() 
	{
		List <WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		int linkCount = hyperLinks.size();
		System.out.println("Total Links" + linkCount);
		
		for(WebElement element:hyperLinks) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	

}
