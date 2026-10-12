package oct09_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		
	}
	
	
	
	@Test(dataProvider = "credentials")
	public void doLogin(String un, String pwd) 
	{
		WebElement textUsername = driver.findElement(By.className(""));
		WebElement textPassword = driver.findElement(By.className(""));
		WebElement btnLogin = driver.findElement(By.className(""));
		
		textUsername.sendKeys(un);
		textPassword.sendKeys(pwd);
		btnLogin.click();
	}
	
	
	
	@DataProvider(name = "credentials")
	
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "";
		data[0][1] = "";
		
		data[1][0] = "";
		data[1][1] = "";
		
		return data;
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	

}
