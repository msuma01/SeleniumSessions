package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsPresent {
	static WebDriver driver;

	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 By logo = By.className("img-responsive");
		 By rightPanelLinks = By.xpath("//div[@class='list-group']/a");
		 By sri = By.id("test");
		 By forgotlinktext = By.linkText("Forgotten Password");
//		 int Count =driver.findElements(logo).size();
//		 System.out.println(Count);
//		 if(Count==1) {
//			 System.out.println("Logo is present on the page");
//		 }else {
//			 System.out.println("Logo is not present on the page");
//		 }
//		 System.out.println(IsElementPresent(logo));
//		 
//		 System.out.println(IsElementPresent(logo, 1));
		 
		 // Assignment: Footer Links
//		 By footerLinks = By.xpath("//body/footer[1]/div[1]/div[1]");
//		 int count=getElementsCount(footerLinks);
//		 System.out.println(count);
		 
		 
		 
//		 System.out.println(IsElementPresent(rightPanelLinks, 12));
//		 System.out.println(IsElementPresent(sri, 0));
//		 System.out.println(IsElementPresentMultipleTimes(forgotlinktext));

	}
	
	public static boolean IsElementPresent(By locator, int expectedElementCount) {
		 if(getElementsCount(locator)==expectedElementCount) {
			
			 return true;
		 } else {
			 
			 return false;
		 }
	}
	public static boolean IsElementPresent(By locator) {
	 if(getElementsCount(locator)==1) {
		 System.out.println("Logo is present on the page");
		 return true;
	 } else {
		 System.out.println("Logo is not present on the page");
		 return false;
	 }
	}
	public  static List<WebElement>  getElements(By locator) {
		return driver.findElements(locator);
		
		
}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
		
	}
	public static boolean IsElementNotPresent(By locator) {
		if(getElementsCount(locator)==0) {
			return true;
		}
		return false;
	}
	public static boolean IsElementPresentMultipleTimes(By locator) {
		if(getElementsCount(locator)>=0) {
			return true;
		}
		return false;
	}
	

}
