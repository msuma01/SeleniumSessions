package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalTextFields {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> Totaltextfields = driver.findElements(By.className("form-control"));
		int length = Totaltextfields.size();
		System.out.println(length);
		
		for(WebElement e: Totaltextfields) {
			String value = e.getAttribute("placeholder");
			System.out.println(value);
		}

	}

}
