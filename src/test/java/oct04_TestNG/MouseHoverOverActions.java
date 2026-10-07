package oct04_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class MouseHoverOverActions {
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void mouseHoverOverActionRightClicActionPerformOnInstagramLink() throws InterruptedException 
	{
		WebElement instaLink = driver.findElement(By.linkText("Instagram"));
		Actions action = new Actions(driver);
		action.moveToElement(instaLink).contextClick().build().perform();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void robotClass() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	@Test(priority=3)
	public void windowHandles() 
	{
		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	

}
