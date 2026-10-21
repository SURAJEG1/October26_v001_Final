package oct19_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class BaseClass {
	
	
	//create object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String baseUrl = readconfig.getBaseUrl();
	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case"":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
			default :
				driver = null;
				break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	public void explicitWait() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	}
	
	public void fluentWait() 
	{
		Wait<WebDriver>  wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
	}
	
	
	
	
	public void windowHandles() 
	{
		Set <String> window = driver.getWindowHandles();
		Iterator <String>  it = window.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	public void pageScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,documente.body.scrollHieght)");
	}
	
	
	
	
	
	
	

}
