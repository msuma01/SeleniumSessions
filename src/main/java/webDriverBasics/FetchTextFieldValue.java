package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchTextFieldValue {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		String text =driver.findElement(By.id("input-email")).getText(); // It wont work like this for getting the text
//		System.out.println(text);
		String text = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(text);

	}

}
