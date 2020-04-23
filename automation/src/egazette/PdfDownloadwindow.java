package egazette;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PdfDownloadwindow {
	@FindBy(id="download")
	private WebElement downloadbtn;
	
	public PdfDownloadwindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void action3()
	{
		downloadbtn.click();
	}
	

}
