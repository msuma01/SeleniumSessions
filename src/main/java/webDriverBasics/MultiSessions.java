package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSessions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		//driver.quit();// last driver will be closed
		driver.close();
		

	}

}
