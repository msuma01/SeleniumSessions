package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysWithPause {
	static WebDriver driver;
	public static void main(String[] args) {
	driver = new EdgeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	By Firstname = By.id("input-firstname");
	//WebElement fs = driver.findElement(Firstname);
	
	doActionsSendkeyswithPause(Firstname, "NaveenAutomationLsb", 200);

  
	}
	
	public static void doActionsSendkeyswithPause(By locator ,String name , long pause) {
		Actions act = new Actions(driver);
		WebElement ele = getElement(locator);
		
	  char ch[]=name.toCharArray();
	  
	 for(char c:ch)  {
		 act.sendKeys(ele,String.valueOf(c)).pause(pause).perform();
	 }
	  
		}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	}
	


