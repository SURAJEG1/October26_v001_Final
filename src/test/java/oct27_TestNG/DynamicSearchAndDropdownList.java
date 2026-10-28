package oct27_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DynamicSearchAndDropdownList {
	
	
	
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
	public void dynamicSearchExample1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.xpath(""));
		searchBox.sendKeys("pen");
		
		Thread.sleep(2000);
		List <WebElement> dynamicList = driver.findElements(By.xpath(""));
		System.out.println("Number of element are : " + dynamicList.size());
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("drive 128")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	public void dynamicSearchExample2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("pen");
		
		Thread.sleep(2000);
		List <WebElement> dynamicList = driver.findElements(By.xpath(""));
		int count = dynamicList.size();
		System.out.println(count);
		
		for(WebElement element:dynamicList) 
		{
			System.out.println(element.getText());
			if(element.getText().equals("drive126")) 
			{
				element.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	

}
