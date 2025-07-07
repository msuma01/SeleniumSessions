package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {

	//headless: no browser activity
	//no browser is visible
	//testing is happening behind the scenes
	
	
	//chrome: ChromeOptions
	//Edge: EdgeOptions
	//Firefox: FirefoxOptions
	public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	//co.addArguments("--headless");
	co.addArguments("--incognito");
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
	WebDriver driver = new ChromeDriver(co);
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	String title = driver.getTitle();
	System.out.println("Title: "+title);
	driver.findElement(By.linkText("Register")).click();
	String title2= driver.getTitle();
	System.out.println("Title: "+title2);
	driver.quit();
	
	
}

}
