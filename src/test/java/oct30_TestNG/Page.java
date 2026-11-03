package oct30_TestNG;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	WebDriver driver;
	//parameterize constructor
	public Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (name = "") WebElement name;
	@FindBy (className = "") WebElement classname;
	@FindBy (id = "") WebElement id;
	@FindBy (tagName = "") List <WebElement> tagname;
	@FindBy (linkText = "") WebElement linktext;
	@FindBy (partialLinkText = "") WebElement partiallinktext;
	@FindBy (css = "") WebElement cssSelector;
	@FindBy (xpath = "") List <WebElement> xpath;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
