package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazontabbingsendkeysAccessibility {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
	}

}
