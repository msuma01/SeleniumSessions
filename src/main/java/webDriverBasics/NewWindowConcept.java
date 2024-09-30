package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String PID = driver.getWindowHandle();
		//driver.switchTo().newWindow(WindowType.TAB);// it will open a blank tab and switch to it as well
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
	
		driver.close();
		driver.switchTo().window(PID);
		System.out.println(driver.getTitle());
		

	}

}
