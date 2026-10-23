package oct23_TestNG;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	WebDriver driver;
	//Parameterize Constructor
	public Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (id = "") WebElement idname;
	@FindBy (name = "") WebElement name;
	@FindBy (className = "") WebElement classname;
	@FindBy (tagName = "") List <WebElement> tagname;
	@FindBy (linkText = "") WebElement linktext;
	@FindBy (partialLinkText = "") WebElement partiallinktext;
	@FindBy (css = "") WebElement cssSecector;
	@FindBy (xpath = "") WebElement xpath;
	
	
	public void lognID(String id) 
	{
		idname.sendKeys(id);
	}
	
	
	
	
	
	
	
	
	
	

}
