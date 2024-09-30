package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiMenuHandling {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		//driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		By level1 = By.xpath("(//span[text()='Category'])[2]");
		By level2= By.linkText("Apparel");
		By level3 = By.linkText("Women's Apparel");
		By level4 = By.linkText("Women's Accessories");
		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(level2)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(level3)).perform();
//		Thread.sleep(2000);
//		driver.findElement(level4).click();
		ParentChildMenu(level1, level2, level3, level4);

	}
	public  static void ParentChildMenu(By level1, By level2, By level3, By level4) throws InterruptedException {
		Actions act = new Actions(driver);
		 Thread.sleep(2000);
		getElement(level1).click();
		Thread.sleep(2000);
		act.moveToElement(getElement(level2)).perform();
	    Thread.sleep(2000);
	    act.moveToElement(getElement(level3)).perform();
	    Thread.sleep(2000);
	    getElement(level4).click();
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}	