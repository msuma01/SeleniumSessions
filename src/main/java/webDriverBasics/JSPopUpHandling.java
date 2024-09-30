package webDriverBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpHandling {
	 static WebDriver driver;
	 public static void main(String[] args) throws Throwable {
		//JS alerts:
			//1. alert
			//2. confirm
			//3. prompt
		 
		 WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//	driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
			Thread.sleep(2000);
		
		//1. Alert	
//			Alert ale=driver.switchTo().alert();
//			String str=ale.getText();
//			System.out.println("The message in the Alert Popup is:"+str);
//			ale.accept();// accept
//			ale.dismiss(); //dismiss the alert
//			//driver is automatically will come to the driver
			
		//2. Confirmation POpup
//			driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
//			Alert ale=driver.switchTo().alert();
//			String str=ale.getText();
//		System.out.println("The message in the Alert Popup is:"+str);
//		//ale.accept();// accept
//		ale.dismiss();
//		
		//3.Prompt
		//driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Alert ale=driver.switchTo().alert();
		String str=ale.getText();
	System.out.println("The message in the Alert Popup is:"+str);
	ale.sendKeys("This is the testing message");
	ale.accept();// accept
	//ale.dismiss();
		
	 }
	 
	 
	 
	 
}
