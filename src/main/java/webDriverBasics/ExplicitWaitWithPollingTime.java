package webDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithPollingTime {

	static WebDriver driver;
	public static void main(String[] args) {
		//2.a WebDriverWait (class)
		//2.b FluentWait(class)
		
	//Wait(I) until();implements -----> FluentWait(C) until(){}+individual methods   extends-------> WebDriverwait(C)-------> No methods
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId = By.id("input-email");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //500 millisec is the default polling time
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@gmail.com");
	
		By terms = By.linkText("Terms & Conditions");
		ElementUtil_6 elUtil = new ElementUtil_6(driver);
		elUtil.WaitForElementAndClick(terms, 10);
	}

}
