package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String name="Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		String lastname = null;
		
		driver.findElement(By.id("input-email")).sendKeys(name," ",sb," ",sf, lastname);
		
		//charsequence
		//String
		//StringBuffer
		//StringBuilder
		

	}

}
