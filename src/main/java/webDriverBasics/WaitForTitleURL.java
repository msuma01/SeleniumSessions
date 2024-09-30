package webDriverBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.linkText("Login")).click();

		ElementUtil_6 el = new ElementUtil_6(driver);
		String ti = el.getPageURLContains("=account/login", 5);
		System.out.println(ti);

	}
	public static String getPageTitleIs(String ExpectedTitle, int timeout) {
		if(waitForTitleIs(ExpectedTitle, timeout)) {
			return driver.getTitle();
		}else {
			return "-1";
		}
	}
	
	public static String getPageTitleContains(String FractionTitle, int timeout) {
		if(waitForTitleContains(FractionTitle, timeout)) {
			return driver.getTitle();
		}else {
			return "-1";
		}
	}

	public static boolean waitForTitleIs(String ExpectedTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		boolean flag = false;

		try {
			return wait.until(ExpectedConditions.titleIs(ExpectedTitle));

		} catch (TimeoutException e) {
			System.out.println("Title is not matched");
		}
		return flag;
	}
	
	public static boolean waitForTitleContains(String FractionTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		boolean flag = false;

		try {
			return wait.until(ExpectedConditions.titleContains(FractionTitle));

		} catch (TimeoutException e) {
			System.out.println("Title is not matched");
		}
		return flag;
	}
	
	public String waitForTitleContainsAndReturn(String fractionTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			wait.until(ExpectedConditions.titleContains(fractionTitle));
			return driver.getTitle();
		} catch (TimeoutException e) {
			System.out.println("title is not matched");
			return "-1";
		}
	}

	public static boolean waitForURLContains(String FractionURL, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		boolean flag = false;

		try {
			return wait.until(ExpectedConditions.urlContains(FractionURL));

		} catch (TimeoutException e) {
			System.out.println("URL is not matched");
		}
		return flag;
	}
	
	public static String getPageURLContains(String FractionURL, int timeout) {
		if(waitForURLContains(FractionURL, timeout)) {
			return driver.getCurrentUrl();
		}else {
			return "-1";
		}
	}
	
	public String waitForURLContainsAndReturn(String fractionURL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			wait.until(ExpectedConditions.urlContains(fractionURL));// true
			return driver.getCurrentUrl();
		} catch (TimeoutException e) {
			System.out.println("URL is not matched");
			return "-1";
		}

	}

}
