package oct14_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearch() 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("pen");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		List <WebElement> dynamicList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		
		System.out.println("Total Count " + dynamicList.size());
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("driver 128")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	@Test
	public void  dynamicSearchExample2() 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("pen");
		
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(Exception.class);
		List <WebElement> dynamicList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		System.out.println("Total Element " + dynamicList.size());
		
		for(WebElement element:dynamicList) 
		{
			System.out.println(element.getText());
			if(element.getText().equals("drive 64")) 
			{
				element.click();
				break;
			}
		}
	}
	
	

	
	
	
	
	
	
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	

}
