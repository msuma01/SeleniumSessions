package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException_7 {
  static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Create web element + perform action (Sendkeys)
		//driver.findElement(By.id("input-email11")).sendKeys("suma@gmail.com"); // NoSuch Element Exception --> while creating the element
//		boolean flag = driver.findElement(By.className("img-responsive11")).isDisplayed();
//		if(flag) {
//			System.out.println("Logo is displayed");
//		}else {
//			System.out.println("Logo is not displayed");
//		}
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
}
	
		
	}

