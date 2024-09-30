package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeElements {
      static WebDriver driver;
	public static void main(String[] args) {
		 driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.getTitle();
	//1. Create Webelement+Perform action
		    //driver.findElement(By.linkText("Register")).click();
		
	//2.
//		   WebElement register = driver.findElement(By.linkText("Register"));
//		   register.click();
		
	//3. By locator
//		By register = By.linkText("Register");
//		WebElement r = driver.findElement(register);
//		r.click();
		
	//4
//		By register = By.linkText("Register");
//		getElement(register).click();
		
	//5
//		By register = By.linkText("Register");
//		getElement(register)
		
		
		
		
		
	//6	
		By header1 = By.tagName("h1");
		By register = By.linkText("Register");
		By Firstname = By.id("input-firstname");
		By Lastname = By.id("input-lastname");
		By Email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By pwdconfirm = By.id("input-confirm");
		By checkbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By contButton = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void dosendkeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
