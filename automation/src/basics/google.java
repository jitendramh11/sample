package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "../automation/exe/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://www.google.com");
		
	}

}
