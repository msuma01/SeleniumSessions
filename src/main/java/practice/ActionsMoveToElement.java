package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsMoveToElement {
static WebDriver driver;
	public static void main(String[] args) {
		//Actions: Default class
		//user actions: Mouse and keyboard
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		By addons= By.xpath("//div[text()='Addons']");
		//By Visaser = By.xpath("//div[text()='']")
		

	}

}
