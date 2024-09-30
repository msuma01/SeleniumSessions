package webDriverBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {
	static WebDriver driver;
	public static void main(String[] args) {
		//2.a WebDriverWait (class)
		//2.b FluentWait(class)
		
	//Wait(I) until();implements -----> FluentWait(C) until(){}+individual methods   extends-------> WebDriverwait(C)-------> No methods
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footers = By.cssSelector("footer a");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //500 millisec is the default polling time
				List<WebElement> footersList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footers));
				
		//An expectation for checking that all elements present on the web page that match the locatorare visible.
		//Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
			System.out.println(footersList.size());
			

	}
public static List<WebElement> WaitForElementsVisible(By locator, int Timeout) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Timeout)); 
	 return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}
}
