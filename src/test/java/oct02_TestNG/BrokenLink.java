package oct02_TestNG;

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
	public void getBrokenLinkCountAndPrintUrl() 
	{
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are " + links.size());
		List<String> urlList = new ArrayList<String>();
		
		for(WebElement element:links) 
		{
			String url = element.getAttribute("href");
			urlList.add(url);
		}
		
		long startTime = System.currentTimeMillis();
		urlList.parallelStream().forEach(element -> checkBrokenLink(element));
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken " + (endTime-startTime));
	}
	
	
	
	public void checkBrokenLink(String listUrl) 
	{
		try {
			URL url = new URL(listUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();

			if(httpUrlConnection.getResponseCode() >=400) 
			{
				System.out.println(listUrl + "--->" + httpUrlConnection.getResponseMessage() + "is a broken link");
			}
			else 
			{
				System.out.println(listUrl + "--->" + httpUrlConnection.getResponseMessage());
			}
		}
		catch(Exception e) {

		}
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();;
	}
	
	
	
	
	
	
	

}
