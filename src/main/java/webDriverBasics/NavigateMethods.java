package webDriverBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable  {
		// back and forward browser simulations
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.amazon.com");
//		System.out.println(driver.getTitle());
//		Thread.sleep(1000);
//
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		Thread.sleep(1000);
//		
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//
//		Thread.sleep(1000);
//		
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.quit();

		//driver.get("https://www.google.com");
		driver.navigate().to(new URL("https://www.amazon.com"));
		driver.navigate().refresh();
	}

}
