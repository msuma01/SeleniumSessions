package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	
	//Scrolling:
	//Partial Scrolling
 	Actions act = new Actions(driver);
//	act.sendKeys(Keys.PAGE_DOWN).perform();
//	act.sendKeys(Keys.PAGE_UP).perform();
//	
//	//Scroll to footer of page
//	act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//	//Scroll to Home of page
//	act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
 	
//	
	//Scroll to Element
	act.scrollToElement(driver.findElement(By.xpath("//div[text()='Get to Know Us']"))).perform();
	Thread.sleep(1000);
	act.click(driver.findElement(By.xpath("//a[text()='About Us']"))).perform();
	
	
	
	
	
	
	
	}

}
