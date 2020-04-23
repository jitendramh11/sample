package egazette;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Digitaldirectory {
	@FindBy (linkText="Digital Directory")
	private WebElement digitaldirectory;
	 public Digitaldirectory(WebDriver driver) 
	 {
		PageFactory.initElements(driver, this); 
	 }
	  public void click0()
	  {
		  digitaldirectory.click(); 
	  }
	

}
