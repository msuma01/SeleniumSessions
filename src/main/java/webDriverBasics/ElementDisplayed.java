package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//boolean Flag = driver.findElement(By.className("img-responsive")).isDisplayed();
		ElementUtil_6 el = new ElementUtil_6(driver);
		By logo = By.className("img-responsive");
		if(el.IsElementDisplayed(logo)) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
		


	}

}
