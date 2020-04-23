package Testgazette;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import egazette.DdSearch;
import egazette.Digitaldirectory;
import egazette.PdfDownloadwindow;
import egazette.Pdffiles;

public class Testgazette {
	@Test
	public void  Testgazette() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "../automation/exe/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "../automation/exe/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.egazette.nic.in");
		driver.manage().window().maximize();
		Digitaldirectory d=new Digitaldirectory(driver);
		d.click0();
		DdSearch s=new DdSearch(driver);
		s.action1();
		Pdffiles p=new Pdffiles(driver);
		p.action2();
		Thread.sleep(2000);
		Set<String> w = driver.getWindowHandles();
		Iterator<String> itr = w.iterator();
		while(itr.hasNext())
			{
			String str = itr.next();
			Reporter.log(str,true);
			driver.switchTo().window(str);
			String tt = driver.getTitle();
			Reporter.log(tt, true);
			}
		
		PdfDownloadwindow pb= new PdfDownloadwindow(driver);
		pb.action3();
}

}

