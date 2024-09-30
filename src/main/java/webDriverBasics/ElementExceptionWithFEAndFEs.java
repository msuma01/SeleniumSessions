package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionWithFEAndFEs {
	
static WebDriver driver;
	public static void main(String[] args) {
		
		//Interview Question:
		/*When Xpath is incorrect, then incase of FE-> It will throw NoSuchElementException. return the first matching element.
		 * When Xpath is incorrect, incase of FEs-> It wont throw Exception It will return Empty List 
		 * and the size of those Elements will be '0'. 
		 */
		driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    	 By logo = By.className("img-responsive11"); 
//		 driver.findElement(logo).click();// NoSuchElementExceptionsince the classname is incorrect
		 List<WebElement> logos = driver.findElements(logo);
		System.out.println(logos.size());

	}

}
