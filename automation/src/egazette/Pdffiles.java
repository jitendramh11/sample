package egazette;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pdffiles {
	@FindBy(id="ContentPlaceHolder1_rptmmain_imgbtndownload_0")
	private WebElement pdf;
	public Pdffiles(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void action2()
	{
		pdf.click();
	}

}
