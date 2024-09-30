package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil bu = new BrowserUtil();
		WebDriver driver = bu.initDriver("Firefox");
		bu.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(bu.getPageTitle());
		System.out.println(bu.getcurrenturl());
		By email = By.id("input-email");
    	By password = By.id("input-password");
    	ElementUtil_6 ut = new ElementUtil_6(driver);
    	ut.doSendKeys(email, "test@gmail.com");
    	ut.doSendKeys(password, "test@123");
		bu.closebrowser();

	}

}
