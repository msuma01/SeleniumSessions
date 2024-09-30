package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(1000);
		//frame:deprecated
		//iframe: W3c Webdriver
		
		//no.of frames
		int framescount=driver.findElements(By.tagName("frame")).size();
		System.out.println(framescount);
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String Header=	driver.findElement(By.tagName("h2")).getText();
		System.out.println(Header);
		
		
		
		

	}

}
