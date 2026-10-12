package oct12_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (name = "") WebElement name;
	@FindBy (className = "") WebElement classname;
	@FindBy (id = "") WebElement id;
	@FindBy (linkText = "") WebElement linktext;
	@FindBy (partialLinkText = "") WebElement partiallinktext;
	@FindBy (tagName = "") WebElement tagname;
	@FindBy (css = "") WebElement cssSelector;
	@FindBy (xpath = "") WebElement xpath;
	
	
	//action methods
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
