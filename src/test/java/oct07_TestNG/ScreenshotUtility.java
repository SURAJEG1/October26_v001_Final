package oct07_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	WebDriver driver;
	//parameterize constructor
	public ScreenshotUtility(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void screeshot() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHssMM").format(new Date());
		File sourct = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileUtils.copyFile(sourct, destination);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
