package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Actions Class: default
		//User Actions: mouse and keyboard
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		By Addons = By.xpath("//div[text()='Add-ons']");
		By visaServices = By.xpath("(//div[text()='Visa Services'])[1]");
		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(Addons)).perform();
//		Thread.sleep(2000);
		
		//ParentChildMenu("Add-ons", "Visa Services");
		
		//ParentChildMenu("SpiceClub", "Benefits");

		
// xpath //div[text()='Add-ons']
		ParentChildMenu(Addons, visaServices);
	}
	
	public static void ParentChildMenu(By ParentMenu, By ChildMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		
		act.moveToElement(getElement(ParentMenu)).perform();
	    Thread.sleep(2000);
		getElement(ChildMenu).click();
		
	}
	public static void ParentChildMenu(String ParentMenu, String ChildMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		
		act.moveToElement(getElement(By.xpath("//*[text()='"+ParentMenu+"']"))).perform();
	    Thread.sleep(2000);
		getElement(By.xpath("//*[text()='"+ChildMenu+"'][1]")).click();
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
