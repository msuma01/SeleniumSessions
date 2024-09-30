package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {
      static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// 1. // Create WebElement + Perform Action(Click, sendkeys, gettext,
		// isddisplayed)

		// driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
//		WebElement email = driver.findElement(By.id("input-email"));
//				WebElement pwd = driver.findElement(By.id("input-password"));
//				email.sendKeys("test@gmail.com");
//				pwd.sendKeys("test@123");
//				email.sendKeys("tom@123.com");
		
		// 3. By Locator
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		WebElement em = driver.findElement(email);
//		WebElement pwd = driver.findElement(password);
//		em.sendKeys("test@gmail.com");
//		pwd.sendKeys("password");
		
		//4. By locator+ generic method for webelement
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		getelement(email).sendKeys("test@gmail.com");
//		getelement(password).sendKeys("test@123");
//	
		//5. By locator+ generic method for webelement and action
		
//		By email = By.id("input-email");
//    	By password = By.id("input-password");
//    	dosendkeys(email, "test@gmail.com");
//    	dosendkeys(password, "test@123");
//    	
    	//6.Bylocator+ generic method for webelement and action in ElementUtil Class
    	By email = By.id("input-email");
    	By password = By.id("input-password");
    	ElementUtil_6 ut = new ElementUtil_6(driver);
    	ut.doSendKeys(email, "test@gmail.com");
    	ut.doSendKeys(password, "test@123");
	}
    
	public static WebElement getelement(By locator)
	{
	//driver.findElement()
	return driver.findElement(locator);
	}
	
    public static void dosendkeys(By locator, String val) {
    	 getelement(locator).sendKeys(val);
    
}
}