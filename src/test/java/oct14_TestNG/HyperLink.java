package oct14_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HyperLink {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@Test
	public void hyperLinkCountAndPrint() 
	{
		List <WebElement> hyperLink =driver.findElements(By.tagName(""));
		System.out.println("Total links are " + hyperLink.size());
		
		for(WebElement element:hyperLink) 
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
