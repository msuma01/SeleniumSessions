package webDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
      static WebDriver driver;
	public static void main(String[] args) {
		//2.a WebDriverWait (class)
		//2.b FluentWait(class)
		
	//Wait(I) until();implements -----> FluentWait(C) until(){}+individual methods   extends-------> WebDriverwait(C)-------> No methods
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId = By.id("input-email1");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email_ele=wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("thor@gmail.com");
		WaitForElementPresence(emailId, 10);
		
		driver.findElement(password).sendKeys("jani123");
		driver.findElement(loginBtn).click();
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. This does notnecessarily mean that the element is visible.
	 * @param locator
	 * @param TimeOut
	 * @return
	 */
	
	public static WebElement WaitForElementPresence(By locator, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible on the page as well.
	 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
	 * @param locator
	 * @param TimeOut
	 * @return
	 */
	public static WebElement WaitForElementVisibile(By locator, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(TimeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
}
