package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisabledTextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		//driver.findElement(By.id("pass")).sendKeys("Naveen"); //ElementNotInteractableException
		
		driver.findElement(By.id("pass")).click();

	}

}
