package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WaitForFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//browser

		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		
		By frameLocator = By.name("main");
		
		ElementUtil_6 elUtil = new ElementUtil_6(driver);
		elUtil.waitForFrameUsingLocatorAndSwitchToIt(frameLocator, 5);
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);	
	}
	}


