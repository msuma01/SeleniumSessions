package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import webDriverBasics.BrowserException;

public class Utilitybrowserpractice {

	WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * name
	 * 
	 * @param browsername
	 * @return this returns driver
	 */

	public WebDriver launchbrowser(String browser) {
		System.out.println("Browsername :" + browser);
		switch (browser.toLowerCase().trim()) {
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

	/**
	 * This method is used to enter the url
	 * 
	 * @param url
	 */
	public void Enterurl(String url) {
		if (url.indexOf("http") != 0 || url.length() == 0) {
			throw new BrowserException("http(s) is missing in the url");

		}
		driver.get(url);

	}

	/**
	 * This method is used to get the titile of the currentpage
	 * 
	 * @return
	 */
	public String getPageTitle() {

		return driver.getTitle();
	}

	/**
	 * this method gets the current url
	 * 
	 * @return current url
	 */

	public String getcurrenturl() {
		return driver.getCurrentUrl();
	}

	/**
	 * this method closes the browser
	 */

	public void closebrowser() {
		driver.quit();

	}
}