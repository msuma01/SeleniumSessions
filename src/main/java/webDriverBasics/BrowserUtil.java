package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	
	WebDriver driver;
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browsername
	 * @return this returns driver
	 */
	public WebDriver initDriver(String browsername) {
		
		System.out.println("Browsername:" +browsername);
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser:");
			throw new BrowserException("INVALID BROWSER");

		}
		return driver;
		
}
	
	public void launchurl(String Url) {
		if(Url.indexOf("http")!=0 || Url.length()==0)
		throw new BrowserException("http(s) is missing in the url");
		driver.get(Url);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getcurrenturl() {
		return driver.getCurrentUrl();
	}
	
	public void closebrowser() {
		 driver.quit();
	}
}

