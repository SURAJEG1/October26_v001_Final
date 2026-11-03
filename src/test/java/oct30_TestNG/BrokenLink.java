package oct30_TestNG;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class BrokenLink {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		
	}
	
	
	
	@Test
	public void getBrokenLinkCountAndPrintUrls() 
	{
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are : " + list.size());
		
		List <String> listUrl = new ArrayList<String>();
		
		for(WebElement element:list) 
		{
			String url = element.getAttribute("href");
			listUrl.add(url);
		}
		
		long startTime = System.currentTimeMillis();
		listUrl.parallelStream().forEach(element -> checkBrokenLink(element));
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken " + (endTime-startTime));
	}
	
	
	
	
	public void checkBrokenLink(String linkUrl) 
	{
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode() >= 400)
			{
				System.out.println(linkUrl + "--->" + httpUrlConnection.getResponseMessage() + "is a broken link");
			} 
			else
			{
				System.out.println(linkUrl + "--->" + httpUrlConnection.getResponseMessage());
			}
			
		}
		catch(Exception e) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		
	}
	
	
	
	

}
