package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendkeys {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(By.id("input-firstname")),"naveen" ).perform();
		act.click(driver.findElement(By.name("agree"))).perform();
		
		
		// Ways to  give input to text field
		//1.using WebElements SendKeys---> sendkeys
		//2. using Actions sendkeys  --->move --- ---> sendkeys---> user actions
		//3. Using Javascript
		
		//// Ways to Click the Element
		//1. Using WebElement Click ---> click
		//2. Using Actions Click ----> move--> click user actions
		


	}
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator));
	}
	
	public static void doActionsSendkeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
