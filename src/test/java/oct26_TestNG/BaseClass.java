package oct26_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@BeforeTest
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case "Edge":
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
	
	
	@AfterTest
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	public void windowHandles() 
	{
		Set <String> window = driver.getWindowHandles();
		Iterator <String> it = window.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,document.body.scrollHeight)");
	}
	
	
	
	public void explicitWait() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		Select sc = new Select(dropdown);
		sc.selectByValue("");
		sc.selectByIndex(5);
		sc.selectByVisibleText("gift");
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).contextClick().build().perform();
	}
	
	
	public void fluentWait() 
	{
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		List <WebElement> dynamicList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
	}
	
	
	
	
	
	

}
