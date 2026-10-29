package oct03_TestNG;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
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
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		default :
			driver = null;
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	public void maximize() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(400, document,body.scrollHeight)");
	}
	
	
	
	public void explicitWait() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		Select sc = new Select(dropdown);
		sc.selectByIndex(5);
		sc.selectByValue("xyd");
		sc.selectByVisibleText("gift");
		dropdown.sendKeys(Keys.ARROW_DOWN);
		
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).contextClick().build().perform();
	}
	
	
	
	public void fluentWait() 
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
		
		List <WebElement> links = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("a")));
		
		System.out.println("Number of links are : " + links.size());
		
		for(WebElement element:links) 
		{
			System.out.println(element.getText());
			String url = element.getAttribute("href");
			System.out.println(url);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
