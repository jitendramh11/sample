package egazette;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DdSearch {
	@FindBy(id="ContentPlaceHolder1_ddlcat1")
	private WebElement selectcategory;
	@FindBy(id="ContentPlaceHolder1_ddlyear1")
	private WebElement year;                  
	@FindBy(id="ContentPlaceHolder1_Button1")
	private WebElement search;
public DdSearch(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
public void action1() throws AWTException
{
	Robot r=new Robot();
	selectcategory.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	year.click();
	search.click();
   search.getText();
			}
}
	

